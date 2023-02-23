package org.org.org.org.xml.asm;

import android.app.job.JobScheduler;
import android.content.Context;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* renamed from: org.org.org.org.xml.asm.b */
/* loaded from: classes.dex */
public final class C14729b extends AbstractC11802m implements InterfaceC11756a<JobScheduler> {

    /* renamed from: a */
    public final /* synthetic */ ClassWriter f32934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14729b(ClassWriter classWriter) {
        super(0);
        this.f32934a = classWriter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final JobScheduler m471a() {
        ClassWriter $r1 = this.f32934a;
        Context $r2 = $r1.f32933c;
        Object $r3 = $r2.getSystemService("jobscheduler");
        if ($r3 != null) {
            JobScheduler $r4 = (JobScheduler) $r3;
            return $r4;
        }
        NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.app.job.JobScheduler");
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ JobScheduler invoke() {
        JobScheduler $r1 = m471a();
        return $r1;
    }
}
