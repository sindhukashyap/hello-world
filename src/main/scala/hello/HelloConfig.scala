package hello
import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.stereotype.Controller
/**
* This config class will trigger Spring @annotation scanning and auto configure Spring context.
*
* @author saung
* @since 1.0
*/
@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
class HelloConfig {
	@RequestMapping(value = Array("/"))
	@ResponseBody
	def functionName(): String = {
		return "Hello World!";
	}
}