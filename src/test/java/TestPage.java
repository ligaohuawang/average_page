import com.lgh.entity.Page;
import com.lgh.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestPage {

    @Autowired
    private IStudentService iStudentService;

    //TODO A2 单元测试发送请求查询数据
    @Test
    public void testStudentPage(){
        Page page = new Page();
        Page page1 = iStudentService.selectStudentPage(page);

        System.out.println(page1.getCurrentPage());
        System.out.println(page1.getPageSize());
        System.out.println(page1.getTotal());
        System.out.println(page1.getTotalPage());
        System.out.println(page1.getList());

    }

}
