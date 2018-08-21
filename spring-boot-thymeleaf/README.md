# spring-boot-thymeleaf
thymeleaf 模板引擎

### 说明
thymeleaf的使用需要在html中加入
```
<html xmlns:th="http://www.w3.org/1999/xhtml">
```

一个完整的实例

```
<!DOCTYPE html>
<html xmlns:th="http://www.w3.org/1999/xhtml">
    <head lang="en">
        <meta charset="UTF-8" />
        <title></title>
    </head>

    <body>
        <h1 th:text="${say}"></h1>
    </body>
</html>
```

后端：
```
/**
 * 调用前端模板并返回数据
 * @author YI
 * @date 2018-8-21 09:50:09
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("say", "Hello World And Thymeleaf");

        return "index";
    }
}
```

服务器启动后访问：http://localhost:8080
![](https://i.imgur.com/CV7sh81.jpg)

### 问题建议

- 联系我的邮箱：ilovey_hwy@163.com
- 我的博客：http://www.hwy.ac.cn
- GitHub：https://github.com/HWYWL