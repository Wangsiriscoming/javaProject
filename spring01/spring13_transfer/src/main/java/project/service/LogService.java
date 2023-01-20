package project.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)  //因为日志不随转账记录成功与否管理，因此特开一个新事务，防止转账事务运行异常造成回滚，日志无法被记录
    void log(String out,String in,int money);
}
