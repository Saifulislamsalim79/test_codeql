package org.org.org.org.org.core.internal;

import a.a.a.a2.e;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.os.AsyncTask;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.c.o.f.u;
import e.a.a.a.e.d.b.a;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.C13287o;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.menu.C14295x;
import lombok.org.asm.menu.InterfaceC14282e;
import lombok.org.asm.signature.C14308x;
import lombok.org.asm.signature.Item;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.core.asm.ClassWriter;
import org.org.org.org.org.core.asm.InterfaceC14659i;
import org.org.org.org.org.menu.C14711c;
import org.org.org.org.xml.core.util.Context;
/* renamed from: org.org.org.org.org.core.internal.b */
/* loaded from: classes.dex */
public final class C14677b implements InterfaceC14659i {

    /* renamed from: a */
    public final C14711c f32678a;

    /* renamed from: b */
    public final e<C13287o<Boolean, a>> f32679b;

    /* renamed from: c */
    public final Queue<u> f32680c;

    /* renamed from: k */
    public final a.a.a.f.a<C13287o<Boolean, a>> f32681k;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14677b(C14711c c14711c) {
        Log_OC.getArray(c14711c, "frameStorageHandler");
        this.f32678a = c14711c;
        InterfaceC14282e $r2 = C14295x.m2196a(1);
        this.f32679b = $r2;
        Item $r3 = C14308x.m2176a($r2);
        this.f32681k = $r3;
        LinkedList $r4 = new LinkedList();
        this.f32680c = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close() {
        AsyncTask.execute(new Runnable() { // from class: org.org.org.org.org.core.internal.MonthByWeekFragment$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                C14677b $r1 = C14677b.this;
                Queue $r2 = $r1.f32680c;
                Object $r3 = $r2.peek();
                org.org.org.org.org.core.asm.Item $r4 = (org.org.org.org.org.core.asm.Item) $r3;
                if ($r4 != null) {
                    $r4.mo860a();
                }
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write() {
        Queue $r1 = this.f32680c;
        $r1.poll();
        close();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(Context context, boolean z) {
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.VIDEO_ENCODING;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, true, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("notifySessionHandlers() called with: ");
            $r7.append("data = ");
            String $r8 = Log.get(context, false, 2, null);
            $r7.append($r8);
            $r7.append(", ");
            $r7.append("isRendered = ");
            $r7.append(z);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r3.size($r4, $r2, "RenderingQueueHandler", $r83);
        }
        e<C13287o<Boolean, a>> eVar = this.f32679b;
        Boolean $r11 = Boolean.valueOf(z);
        C13287o $r10 = new C13287o($r11, context);
        eVar.offer($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Item m792a() {
        return this.f32681k;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.asm.InterfaceC14659i
    public void close(Context context) {
        Log_OC.getArray(context, TransactionBreakDownItemType.DATA);
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.VIDEO_ENCODING;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, true, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onTaskSuccess() called with: data = ");
            String $r8 = Log.get(context, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "RenderingQueueHandler", $r83);
        }
        C14711c $r9 = this.f32678a;
        String $r84 = context.getName();
        int $i02 = context.m449a();
        $r9.m575d($r84, $i02);
        write(context, true);
        write();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.asm.InterfaceC14659i
    /* renamed from: d */
    public void mo790d(Context context) {
        Log_OC.getArray(context, TransactionBreakDownItemType.DATA);
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.VIDEO_ENCODING;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, true, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onTaskFailure() called with: data = ");
            String $r8 = Log.get(context, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r4.size($r2, $r3, "RenderingQueueHandler", $r83);
        }
        write(context, false);
        write();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(Context context) {
        Log_OC.getArray(context, TransactionBreakDownItemType.DATA);
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.VIDEO_ENCODING;
        LogSeverity $r1 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, true, $r1);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("scheduleRendering() called with: ");
            $r7.append("data = ");
            $r7.append(context);
            $r7.append(", ");
            $r7.append("renderingQueueCount = ");
            Queue $r8 = this.f32680c;
            int $i02 = $r8.size();
            $r7.append($i02);
            String $r9 = $r7.toString();
            $r6.append($r9);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            String $r92 = $r6.toString();
            $r3.size($r4, $r1, "RenderingQueueHandler", $r92);
        }
        Queue $r82 = this.f32680c;
        ClassWriter $r10 = new ClassWriter(context, this);
        $r82.add($r10);
        Queue $r83 = this.f32680c;
        int $i03 = $r83.size();
        if ($i03 == 1) {
            close();
        }
    }
}
