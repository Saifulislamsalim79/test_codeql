package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p293c0.C8329a;
import p272h.p286c.p287a.p288a.p289i.p298y.C8379a;
/* compiled from: JobInfoScheduler.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
/* loaded from: classes2.dex */
public class C2665r implements InterfaceC2675x {

    /* renamed from: a */
    private final Context f7463a;

    /* renamed from: b */
    private final InterfaceC8272i0 f7464b;

    /* renamed from: c */
    private final AbstractC2666s f7465c;

    public C2665r(Context context, InterfaceC8272i0 interfaceC8272i0, AbstractC2666s abstractC2666s) {
        this.f7463a = context;
        this.f7464b = interfaceC8272i0;
        this.f7465c = abstractC2666s;
    }

    /* renamed from: d */
    private boolean m32441d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x
    /* renamed from: a */
    public void mo32399a(AbstractC8352p abstractC8352p, int i) {
        mo32398b(abstractC8352p, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x
    /* renamed from: b */
    public void mo32398b(AbstractC8352p abstractC8352p, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f7463a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f7463a.getSystemService("jobscheduler");
        int m32442c = m32442c(abstractC8352p);
        if (!z && m32441d(jobScheduler, m32442c, i)) {
            C8379a.m16167a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC8352p);
            return;
        }
        long mo16372M0 = this.f7464b.mo16372M0(abstractC8352p);
        AbstractC2666s abstractC2666s = this.f7465c;
        JobInfo.Builder builder = new JobInfo.Builder(m32442c, componentName);
        abstractC2666s.m32438c(builder, abstractC8352p.mo16239d(), mo16372M0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC8352p.mo16241b());
        persistableBundle.putInt("priority", C8329a.m16294a(abstractC8352p.mo16239d()));
        if (abstractC8352p.mo16240c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC8352p.mo16240c(), 0));
        }
        builder.setExtras(persistableBundle);
        C8379a.m16166b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC8352p, Integer.valueOf(m32442c), Long.valueOf(this.f7465c.m32434g(abstractC8352p.mo16239d(), mo16372M0, i)), Long.valueOf(mo16372M0), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }

    /* renamed from: c */
    int m32442c(AbstractC8352p abstractC8352p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f7463a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC8352p.mo16241b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C8329a.m16294a(abstractC8352p.mo16239d())).array());
        if (abstractC8352p.mo16240c() != null) {
            adler32.update(abstractC8352p.mo16240c());
        }
        return (int) adler32.getValue();
    }
}
