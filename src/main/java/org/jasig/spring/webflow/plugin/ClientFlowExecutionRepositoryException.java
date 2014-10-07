package org.jasig.spring.webflow.plugin;

import org.springframework.webflow.execution.repository.FlowExecutionRepositoryException;

/**
 * Describes exceptions unique to {@link ClientFlowExecutionRepository}.
 *
 * @author Marvin S. Addison
 */
public class ClientFlowExecutionRepositoryException extends FlowExecutionRepositoryException {

    private static final long serialVersionUID = 2164175424974041060L;

    public ClientFlowExecutionRepositoryException(final String message) {
        super(message);
    }

    public ClientFlowExecutionRepositoryException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
