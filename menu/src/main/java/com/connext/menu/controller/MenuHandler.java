package com.connext.menu.controller;/**
 * @author Jason.Wu1.
 * @date 2020/2/12.
 * @time 19:36.
 */

import com.connext.menu.entity.Menu;
import com.connext.menu.entity.MenuVO;
import com.connext.menu.entity.Type;
import com.connext.menu.repository.MenuRepository;
import com.connext.menu.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: ordersystem
 * @description: 菜单控制器
 * @author: Jason.Wu1
 * @create: 2020-02-12 19:36
 **/
@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private TypeRepository typeRepository;

    @GetMapping("/index")
    public String getPort() {
        return "menu的端口号为"+ this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit){
        List<Menu> list = menuRepository.findAll(index, limit);
        return new MenuVO(0,"",menuRepository.count(),list);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuRepository.deleteById(id);
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRepository.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuRepository.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuRepository.update(menu);
    }
}
