package interceptor;

import java.util.logging.Logger;

import interceptor.binding.ExecutionTime;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@ExecutionTime
@Interceptor
public class LoggingInterceptor {

	@Inject
	private Logger _logger;

	@AroundInvoke
	public Object measureTime(final InvocationContext ic) throws Exception {
		long start = System.nanoTime();
		Object proceed = ic.proceed();
		long executionTime = System.nanoTime() - start;
		_logger.info(ic.getMethod().getName() + " call took nanoseconds: "
				+ executionTime);
		return proceed;
	}

}
