package ru.silent.spring.tgbot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import ru.silent.spring.tgbot.config.AppConfig;
import ru.silent.spring.tgbot.repository.ActiveChatRepository;
import ru.silent.spring.tgbot.repository.IncomeRepository;
import ru.silent.spring.tgbot.repository.SpendRepository;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = { AppConfig.class },
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class DBTest {
    @Resource
    private ActiveChatRepository activeChatRepository;
    @Resource
    private IncomeRepository incomeRepository;
    @Resource
    SpendRepository spendRepository;

    @Test
    public void testActiveChatRepository() {
        activeChatRepository.findActiveChatByChatId(1003L);
    }

    /*@Test
    public void testIncomeRepository() {

    }*/

    @Test
    public void testSpendRepository() {

    }
}
