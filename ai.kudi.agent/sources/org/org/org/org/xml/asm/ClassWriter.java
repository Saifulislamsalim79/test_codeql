package org.org.org.org.xml.asm;

import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.smartlook.sdk.smartlook.job.worker.record.UploadRecordJob;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.xml.FastMap;
import org.org.org.org.xml.core.Attribute;
import org.org.org.org.xml.core.Segment;
/* loaded from: classes.dex */
public final class ClassWriter extends Label {

    /* renamed from: a */
    public final InterfaceC11824h f32932a;

    /* renamed from: c */
    public final Context f32933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ClassWriter(Context context, FastMap fastMap) {
        super(fastMap);
        InterfaceC11824h $r2;
        Log_OC.getArray(context, "context");
        Log_OC.getArray(fastMap, "sessionRecordIdStorage");
        this.f32933c = context;
        C14729b $r4 = new C14729b(this);
        $r2 = C13218k.m5625b($r4);
        this.f32932a = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final JobScheduler m473a() {
        InterfaceC11824h $r2 = this.f32932a;
        Object $r1 = $r2.getValue();
        JobScheduler $r3 = (JobScheduler) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.xml.asm.Label
    /* renamed from: a */
    public void mo468a(Segment segment) {
        Log_OC.getArray(segment, "jobType");
        boolean $z0 = segment instanceof Attribute;
        if (!$z0) {
            Throwable r25 = new NoWhenBranchMatchedException();
            Throwable r26 = r25;
            throw r26;
        }
        FastMap $r4 = setColor();
        Attribute $r5 = (Attribute) segment;
        org.org.org.org.xml.core.util.Label $r6 = $r5.m450a();
        String $r7 = $r6.m448a();
        org.org.org.org.xml.core.util.Label $r62 = $r5.m450a();
        int $i0 = $r62.m446c();
        int $i02 = $r4.get($r7, $i0);
        Context $r9 = this.f32933c;
        ComponentName r21 = new ComponentName($r9, UploadRecordJob.class);
        JobInfo.Builder r22 = new JobInfo.Builder($i02, r21);
        PersistableBundle r23 = new PersistableBundle();
        org.org.org.org.xml.core.util.Label $r63 = $r5.m450a();
        JSONObject $r11 = $r63.equals();
        String $r72 = $r11.toString();
        r23.putString(IssueTypeFragmentNew.DATA, $r72);
        JobInfo.Builder $r3 = r22.setExtras(r23);
        org.org.org.org.xml.core.util.Label $r64 = $r5.m450a();
        boolean $z02 = $r64.m445d();
        JobInfo $r12 = $r3.setRequiredNetworkType($z02 ? 1 : 2).setRequiresCharging(false).build();
        try {
            JobScheduler $r13 = m473a();
            List $r14 = $r13.getAllPendingJobs();
            int $i03 = $r14.size();
            if ($i03 > 80) {
                System $r15 = System.f32375c;
                LogAspect $r16 = LogAspect.REST;
                LogSeverity $r17 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r18 = $r15.get($r16, true, $r17);
                int $i04 = $r18.ordinal();
                if ($i04 != 0) {
                    return;
                }
                String $r73 = "scheduleJob(): job was not scheduled, limit was reached, [logAspect: " + $r16 + ']';
                $r15.size($r16, $r17, "JobSchedulerWorker", $r73);
                return;
            }
            JobScheduler $r132 = m473a();
            int $i05 = $r132.schedule($r12);
            if ($i05 == 0) {
                System $r152 = System.f32375c;
                LogAspect $r162 = LogAspect.REST;
                LogSeverity $r172 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r182 = $r152.get($r162, true, $r172);
                int $i06 = $r182.ordinal();
                if ($i06 != 0) {
                    return;
                }
                String $r74 = "scheduleJob(): job was not scheduled, failure, [logAspect: " + $r162 + ']';
                $r152.size($r162, $r172, "JobSchedulerWorker", $r74);
            }
        } catch (Exception e) {
            System $r153 = System.f32375c;
            LogAspect $r163 = LogAspect.REST;
            LogSeverity $r173 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r183 = $r153.get($r163, true, $r173);
            int $i07 = $r183.ordinal();
            if ($i07 != 0) {
                return;
            }
            String $r75 = "scheduleJob(): job was not scheduled, limit was reached, [logAspect: " + $r163 + ']';
            $r153.size($r163, $r173, "JobSchedulerWorker", $r75);
        }
    }
}
