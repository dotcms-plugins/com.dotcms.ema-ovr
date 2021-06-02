package com.dotmarketing.osgi.webinterceptors;

import com.dotcms.ema.EMAWebInterceptor;
import com.dotcms.filters.interceptor.FilterWebInterceptorProvider;
import com.dotcms.filters.interceptor.WebInterceptorDelegate;
import com.dotmarketing.filters.InterceptorFilter;
import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Config;
import org.osgi.framework.BundleContext;

public class Activator extends GenericBundleActivator {

    private String interceptorName;

    @SuppressWarnings ("unchecked")
    public void start (final BundleContext context ) throws Exception {

        final FilterWebInterceptorProvider filterWebInterceptorProvider =
                FilterWebInterceptorProvider.getInstance(Config.CONTEXT);

        final WebInterceptorDelegate delegate =
                    filterWebInterceptorProvider.getDelegate(InterceptorFilter.class);

        final String currentEMAInterceptorName = EMAWebInterceptor.class.getName();
        delegate.remove(currentEMAInterceptorName, true); // delete the current EMA to replace with a new one

        final EMAOvrWebInterceptor emaOvrWebInterceptor = new EMAOvrWebInterceptor();
        this.interceptorName = emaOvrWebInterceptor.getName();
        delegate.addFirst(emaOvrWebInterceptor);

    }

    public void stop ( BundleContext context ) throws Exception {

        final FilterWebInterceptorProvider filterWebInterceptorProvider =
                FilterWebInterceptorProvider.getInstance(Config.CONTEXT);

        final WebInterceptorDelegate delegate =
                filterWebInterceptorProvider.getDelegate(InterceptorFilter.class);

        delegate.remove(this.interceptorName, true);
        final EMAWebInterceptor emaWebInterceptor = new EMAWebInterceptor();
        delegate.addFirst(emaWebInterceptor);
    }

}
