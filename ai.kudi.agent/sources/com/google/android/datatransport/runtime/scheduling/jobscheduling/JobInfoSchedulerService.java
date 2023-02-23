package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.C8357t;
import p272h.p286c.p287a.p288a.p289i.p293c0.C8329a;
/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    /* renamed from: a */
    public /* synthetic */ void m32444a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C8357t.m16222f(getApplicationContext());
        AbstractC8352p.AbstractC8353a m16242a = AbstractC8352p.m16242a();
        m16242a.mo16235b(string);
        m16242a.mo16233d(C8329a.m16293b(i));
        if (string2 != null) {
            m16242a.mo16234c(Base64.decode(string2, 0));
        }
        C8357t.m16225c().m16223e().m32409k(m16242a.mo16236a(), i2, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m32444a(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
