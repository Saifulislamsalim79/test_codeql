package io.intercom.android.sdk.package_2;

import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes.dex */
class RateLimiter {
    private final AppConfig appConfig;
    private int limitedRequestCount;
    private long periodStartTimestamp;
    private final TimeProvider timeProvider;
    private final Twig twig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RateLimiter(io.intercom.android.sdk.identity.AppConfig r2) {
        /*
            r1 = this;
            io.intercom.android.sdk.commons.utilities.TimeProvider r0 = io.intercom.android.sdk.commons.utilities.TimeProvider.SYSTEM
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.package_2.RateLimiter.<init>(io.intercom.android.sdk.identity.AppConfig):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    RateLimiter(AppConfig appConfig, TimeProvider timeProvider) {
        Twig $r3 = LumberMill.getLogger();
        this.twig = $r3;
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean hasReachedMaxCount() {
        int $i1 = this.limitedRequestCount;
        AppConfig $r1 = this.appConfig;
        int $i0 = $r1.getRateLimitCount();
        return $i1 >= $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private boolean isInsideCurrentTimePeriod() {
        TimeProvider $r1 = this.timeProvider;
        long $l1 = $r1.currentTimeMillis();
        long $l2 = this.periodStartTimestamp;
        long $l12 = $l1 - $l2;
        AppConfig $r2 = this.appConfig;
        long $l22 = $r2.getRateLimitPeriodMs();
        return $l12 < $l22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean isLimited() {
        boolean $z0 = isInsideCurrentTimePeriod();
        if ($z0) {
            boolean $z02 = hasReachedMaxCount();
            return $z02;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void logError() {
        Twig $r1 = this.twig;
        Object[] $r2 = new Object[0];
        $r1.m13068e("Your app is being rate limited because you're performing too many requests per minute", $r2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void recordRequest() {
        boolean $z0 = isInsideCurrentTimePeriod();
        if (!$z0) {
            TimeProvider $r1 = this.timeProvider;
            long $l0 = $r1.currentTimeMillis();
            this.periodStartTimestamp = $l0;
            this.limitedRequestCount = 0;
        }
        int $i1 = this.limitedRequestCount;
        this.limitedRequestCount = $i1 + 1;
    }
}
