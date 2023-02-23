package org.org.org.org.xml.asm;

import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.e.e.e.c;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import org.json.JSONObject;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.xml.FastMap;
import org.org.org.org.xml.core.Attribute;
import org.org.org.org.xml.core.Segment;
/* renamed from: org.org.org.org.xml.asm.f */
/* loaded from: classes.dex */
public final class C14731f extends Label {

    /* renamed from: c */
    public final Context f32938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14731f(Context context, FastMap fastMap) {
        super(fastMap);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(fastMap, "sessionRecordIdStorage");
        this.f32938c = context;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final int m469a() {
        List $r4;
        WorkManager $r1 = m467e();
        WorkInfo.State $r3 = WorkInfo.State.RUNNING;
        WorkInfo.State $r32 = WorkInfo.State.ENQUEUED;
        WorkInfo.State[] $r2 = {$r3, $r32};
        $r4 = C13726r.m3888h($r2);
        WorkQuery.Builder $r5 = WorkQuery.Builder.fromStates($r4);
        WorkQuery $r6 = $r5.build();
        Future $r7 = $r1.getWorkInfos($r6);
        Future r9 = $r7;
        Object $r8 = r9.get();
        List $r42 = (List) $r8;
        int $i0 = $r42.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    private final WorkManager m467e() {
        Context $r2 = this.f32938c;
        WorkManager $r1 = WorkManager.getInstance($r2);
        Log_OC.loadImage($r1, "WorkManager.getInstance(context)");
        return $r1;
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
            Throwable r34 = new NoWhenBranchMatchedException();
            Throwable r35 = r34;
            throw r35;
        }
        FastMap $r3 = setColor();
        Attribute $r4 = (Attribute) segment;
        org.org.org.org.xml.core.util.Label $r5 = $r4.m450a();
        String $r6 = $r5.m448a();
        org.org.org.org.xml.core.util.Label $r52 = $r4.m450a();
        int $i0 = $r3.get($r6, $r52.m446c());
        m466f($i0);
        OneTimeWorkRequest.Builder r30 = new OneTimeWorkRequest.Builder(c.class);
        String $r62 = String.valueOf($i0);
        OneTimeWorkRequest.Builder addTag = r30.addTag($r62);
        org.org.org.org.xml.core.util.Label $r53 = $r4.m450a();
        JSONObject $r10 = $r53.equals();
        String $r63 = $r10.toString();
        C13287o[] $r9 = {C13664u.m4227a(IssueTypeFragmentNew.DATA, $r63)};
        Data.Builder r31 = new Data.Builder();
        for (int $i02 = 0; $i02 < 1; $i02++) {
            C13287o $r11 = $r9[$i02];
            Object $r13 = $r11.m5364c();
            String $r64 = (String) $r13;
            Object $r132 = $r11.m5363d();
            r31.put($r64, $r132);
        }
        Data $r14 = r31.build();
        Log_OC.m10360a($r14, "dataBuilder.build()");
        OneTimeWorkRequest.Builder $r7 = addTag.setInputData($r14);
        Log_OC.loadImage($r7, "when (jobType) {\n       …)\n            }\n        }");
        Constraints.Builder r32 = new Constraints.Builder();
        org.org.org.org.xml.core.util.Label $r54 = $r4.m450a();
        boolean $z02 = $r54.m445d();
        NetworkType $r16 = $z02 ? NetworkType.CONNECTED : NetworkType.UNMETERED;
        Constraints.Builder $r15 = r32.setRequiredNetworkType($r16);
        Constraints $r17 = $r15.build();
        Log_OC.loadImage($r17, "Constraints.Builder()\n  …RED)\n            .build()");
        BackoffPolicy $r18 = BackoffPolicy.LINEAR;
        TimeUnit $r19 = TimeUnit.SECONDS;
        OneTimeWorkRequest build = $r7.setConstraints($r17).setBackoffCriteria($r18, 20L, $r19).build();
        Log_OC.loadImage(build, "request\n            .set…NDS)\n            .build()");
        OneTimeWorkRequest $r21 = build;
        try {
            if (m469a() <= 80) {
                WorkManager $r22 = m467e();
                Operation $r23 = $r22.enqueue($r21);
                Log_OC.loadImage($r23, "workManager.enqueue(uploadWorkRequest)");
                return;
            }
            System $r24 = System.f32375c;
            LogAspect $r25 = LogAspect.REST;
            LogSeverity $r26 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r27 = $r24.get($r25, false, $r26);
            if ($r27.ordinal() != 0) {
                return;
            }
            String $r65 = "scheduleJob(): job was not scheduled, limit was reached, [logAspect: " + $r25 + ']';
            $r24.size($r25, $r26, "WorkManagerWorker", $r65);
        } catch (Exception e) {
            System $r242 = System.f32375c;
            LogAspect $r252 = LogAspect.REST;
            LogSeverity $r262 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r272 = $r242.get($r252, false, $r262);
            if ($r272.ordinal() != 0) {
                return;
            }
            String $r66 = "scheduleJob(): job was not scheduled, limit was reached, [logAspect: " + $r252 + ']';
            $r242.size($r252, $r262, "WorkManagerWorker", $r66);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public void m466f(int i) {
        WorkManager $r1 = m467e();
        String $r2 = String.valueOf(i);
        $r1.cancelAllWorkByTag($r2);
    }
}
