package interceptor;

import interceptor.binding.ExecutionTime;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@ExecutionTime
@Interceptor
public class StopWatchInterceptor {

	@Inject
	private Logger _logger;

	@AroundInvoke
	public Object measureTime(final InvocationContext ic) throws Exception {
		final long start = System.nanoTime();

		final Object proceed = ic.proceed();

		final long executionTime = System.nanoTime() - start;
		_logger.info(ic.getMethod().getName() + " call took nanoseconds: "
				+ executionTime);

		return proceed;
	}
}
