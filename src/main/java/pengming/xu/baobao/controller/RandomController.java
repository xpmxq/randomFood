package pengming.xu.baobao.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName
 * @Description
 * @Author pengming.xu
 * @Date 2018-11-27 16:53
 * @Since V1.0.0
 */
@Controller
public class RandomController {

    private Logger logger = LogManager.getLogger(this.getClass());

    @RequestMapping("index")
    public ModelAndView getIndex(HttpServletRequest request){
        logger.debug(request.getRequestURL()+"请求获取页面");
        return new ModelAndView("randomBao");
    }

}
