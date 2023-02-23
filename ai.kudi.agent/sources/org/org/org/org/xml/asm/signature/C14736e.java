package org.org.org.org.xml.asm.signature;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.tree.InterfaceC14336i;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.common.screens.InterfaceC14645a;
import org.org.org.org.xml.core.util.Label;
/* renamed from: org.org.org.org.xml.asm.signature.e */
/* loaded from: classes.dex */
public final class C14736e {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static void m459a(InterfaceC14732a interfaceC14732a, Label label, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(label, TransactionBreakDownItemType.DATA);
        Log_OC.getArray(interfaceC11767l, "result");
        InterfaceC14336i $r4 = interfaceC14732a.mo457a();
        a$b$a $r3 = new a$b$a(interfaceC14732a, label, interfaceC11767l);
        $r4.mo2089a(label, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static boolean m461a(InterfaceC14732a interfaceC14732a, Handle handle) {
        Log_OC.getArray(handle, "$this$cannotBeRecovered");
        int $i0 = handle.getName();
        return (400 <= $i0 && 499 >= $i0) || handle.getName() == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static void m458b(InterfaceC14732a interfaceC14732a, Label label) {
        System $r4 = System.f32375c;
        LogAspect $r0 = LogAspect.RECORD_STORAGE;
        LogSeverity $r1 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r0, true, $r1);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("onSuccess() deleting record with: ");
            $r7.append("sessionId = ");
            String $r8 = label.m448a();
            $r7.append($r8);
            $r7.append(", ");
            $r7.append("recordIndex = ");
            int $i02 = label.m446c();
            $r7.append($i02);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r0);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r4.size($r0, $r1, "UploadRecordBase", $r83);
        }
        InterfaceC14645a $r9 = interfaceC14732a.mo455b();
        String $r84 = label.m448a();
        int $i03 = label.m446c();
        $r9.mo913a($r84, $i03);
    }
}
