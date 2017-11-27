package com.example.demo.controller;

import com.example.demo.http.Constants;
import com.example.demo.http.OkHttpUtils;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author
 */
@Controller
@RequestMapping(value = "/gitee", method = RequestMethod.GET)
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(ModelMap model) {
        String url = Constants.GET_CLIENT_CODE +
                "client_id=" + Constants.CLIENT_ID +
                "&redirect_uri=" + Constants.REDIRECT_URI +
                "&response_type=code";
        return new ModelAndView(new RedirectView(url));
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String getAccessToken(HttpServletRequest request, ModelMap model) {
        try {
            String code = request.getParameter("code");
            if (code == null || "".equals(code)) {
                throw new Exception("获取code失败");
            }

            HashMap<String, String> param = new HashMap<>(5);
            param.put("grant_type", Constants.GRANT_TYPE);
            param.put("code", code);
            param.put("client_id", Constants.CLIENT_ID);
            param.put("redirect_uri", Constants.REDIRECT_URI);
            param.put("client_secret", Constants.CLIENT_SECRET);
            // 获取okHttp实例
            OkHttpUtils okHttpUtils = OkHttpUtils.getInstance();
            //post同步请求execute()
            Response response = okHttpUtils.post(Constants.POST_ACCESS_TOKEN, param).execute();
            if (response.isSuccessful()) {
                //获取tokenJson
                String data = response.body().string();
                model.addAttribute("msg", "请求成功");
                model.addAttribute("token", data);
//                return "token:" + data;
            } else {
                throw new IOException("Unexpected code " + response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("msg", "请求失败");
            model.addAttribute("token", e.toString());
//            return "请求失败:"+e.toString();
        }
        return "redirect";
    }
}
