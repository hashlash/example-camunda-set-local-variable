package example.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

/**
 * Created by ashlah on 08/08/17.
 */
public class InitLocalVar implements ExecutionListener {
    @Override
    public void notify(DelegateExecution execution) throws Exception {
//        execution.setVariable("myVar", "a value", execution.getCurrentActivityId());
        execution.setVariable("myVar", "a value"); // this work fine
    }
}
