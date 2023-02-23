package com.smartlook.sdk.smartlook.job.worker.record;

import a.a.a.d0;
import a.a.a.j1;
import a.a.a.l1;
import a.a.a.t;
import a.a.a.u;
import a.a.a.w;
import a.a.b.a.b.d.d.f;
import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import android.app.job.JobParameters;
import android.os.PersistableBundle;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.e.e.e.b;
import e.a.a.a.f.a0.a;
import e.a.a.a.f.a0.c;
import java.util.concurrent.CancellationException;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.json.JSONObject;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/job/worker/record/UploadRecordJob;", "La/a/a/w;", "Le/a/a/a/e/e/e/b;", "Landroid/app/job/JobParameters;", "params", "", "a", "(Landroid/app/job/JobParameters;)V", "", "onStopJob", "(Landroid/app/job/JobParameters;)Z", "onStartJob", "Lkotlin/coroutines/CoroutineContext;", "f", "Lkotlin/coroutines/CoroutineContext;", "e", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "La/a/a/t;", "La/a/a/t;", "job", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class UploadRecordJob extends b implements w {

    /* renamed from: e */
    public final j1 f17199e;

    /* renamed from: f */
    public final InterfaceC11719g f17200f;

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m10421d2 = {"com/smartlook/sdk/smartlook/job/worker/record/UploadRecordJob$a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.job.worker.record.UploadRecordJob$a */
    /* loaded from: classes2.dex */
    public static final class C7262a {
        private C7262a() {
        }

        public /* synthetic */ C7262a(g gVar) {
            this();
        }
    }

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m10421d2 = {"La/a/a/h0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/smartlook/sdk/smartlook/job/worker/record/UploadRecordJob$startUpload$1$2", "<anonymous>"}, k = 3, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.job.worker.record.UploadRecordJob$b */
    /* loaded from: classes2.dex */
    public static final class C7263b extends AbstractC11745k implements InterfaceC11771p<w, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        public w f17201c;

        /* renamed from: d */
        public final /* synthetic */ e.a.a.a.e.d.b.b f17202d;

        /* renamed from: e */
        public final /* synthetic */ UploadRecordJob f17203e;

        /* renamed from: f */
        public final /* synthetic */ JobParameters f17204f;

        @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m10421d2 = {"La/a/b/a/b/d/d/f;", "", "result", "a", "(La/a/b/a/b/d/d/f;)V", "com/smartlook/sdk/smartlook/job/worker/record/UploadRecordJob$startUpload$1$2$1"}, k = 3, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
        /* renamed from: com.smartlook.sdk.smartlook.job.worker.record.UploadRecordJob$b$a */
        /* loaded from: classes2.dex */
        public static final class C7264a extends AbstractC11802m implements InterfaceC11767l<f<? extends C13666w>, C13666w> {
            public C7264a() {
                super(1);
            }

            /* renamed from: a */
            public final void m19061a(f<C13666w> fVar) {
                l.f(fVar, "result");
                if (fVar instanceof f.b) {
                    C7263b c7263b = C7263b.this;
                    c7263b.f17203e.jobFinished(c7263b.f17204f, false);
                } else if (fVar instanceof f.a) {
                    if (C7263b.this.f17203e.a((f.a) fVar)) {
                        C7263b c7263b2 = C7263b.this;
                        c7263b2.f17203e.jobFinished(c7263b2.f17204f, false);
                        return;
                    }
                    C7263b c7263b3 = C7263b.this;
                    c7263b3.f17203e.jobFinished(c7263b3.f17204f, true);
                }
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            public /* bridge */ /* synthetic */ C13666w invoke(f<? extends C13666w> fVar) {
                m19061a(fVar);
                return C13666w.f30112a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7263b(e.a.a.a.e.d.b.b bVar, InterfaceC11714d interfaceC11714d, UploadRecordJob uploadRecordJob, JobParameters jobParameters) {
            super(2, interfaceC11714d);
            this.f17202d = bVar;
            this.f17203e = uploadRecordJob;
            this.f17204f = jobParameters;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            l.f(interfaceC11714d, "completion");
            C7263b c7263b = new C7263b(this.f17202d, interfaceC11714d, this.f17203e, this.f17204f);
            c7263b.f17201c = (w) obj;
            return c7263b;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(w wVar, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7263b) create(wVar, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            C11734d.m10387d();
            C13291q.m5357b(obj);
            try {
                this.f17203e.a(this.f17202d, new C7264a());
            } catch (Exception e) {
                c cVar = c.f;
                LogAspect logAspect = LogAspect.REST;
                LogSeverity logSeverity = LogSeverity.ERROR;
                if (cVar.a(logAspect, true, logSeverity).ordinal() == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("startUpload(): failed with exception: " + e + ", recordJobData = " + a.c(this.f17202d, false, 2, (Object) null));
                    sb.append(", [logAspect: ");
                    sb.append(logAspect);
                    sb.append(']');
                    cVar.d(logAspect, logSeverity, "UploadRecordJob", sb.toString());
                }
                this.f17203e.jobFinished(this.f17204f, false);
            }
            return C13666w.f30112a;
        }
    }

    static {
        new C7262a(null);
    }

    public UploadRecordJob() {
        j1 a = l1.a((t) null, 1, (Object) null);
        this.f17199e = a;
        this.f17200f = a.plus(e.a.a.a.c.h.b.c.a().b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m19063a(JobParameters jobParameters) {
        PersistableBundle extras;
        String string;
        if (jobParameters != null && (extras = jobParameters.getExtras()) != null && (string = extras.getString(IssueTypeFragmentNew.DATA)) != null) {
            e.a.a.a.e.d.b.b a = e.a.a.a.e.d.b.b.y.a(new JSONObject(string));
            c cVar = c.f;
            LogAspect logAspect = LogAspect.REST;
            LogSeverity logSeverity = LogSeverity.DEBUG;
            if (cVar.a(logAspect, false, logSeverity).ordinal() == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("startUpload(): called with: recordJobData = " + a.c(a, false, 2, (Object) null));
                sb.append(", [logAspect: ");
                sb.append(logAspect);
                sb.append(']');
                cVar.d(logAspect, logSeverity, "UploadRecordJob", sb.toString());
            }
            u.a(this, (InterfaceC11719g) null, (d0) null, new C7263b(a, null, this, jobParameters), 3, (Object) null);
            return;
        }
        jobFinished(jobParameters, false);
    }

    /* renamed from: e */
    public InterfaceC11719g m19062e() {
        return this.f17200f;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m19063a(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        this.f17199e.c((CancellationException) null);
        return true;
    }
}
