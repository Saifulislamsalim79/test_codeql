package org.org.org.org.org.common;

import android.os.Bundle;
import com.smartlook.sdk.smartlook.core.session.model.UserProperties;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import org.json.JSONObject;
import org.org.org.org.asm.asm.Expression;
import org.org.org.org.asm.asm.MutableMapWithDefaultImpl;
import org.org.org.org.asm.menu.C14607f;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.asm.InterfaceC14636g;
import org.org.org.org.org.common.telemetry.C14648h;
import org.org.org.org.org.menu.InterfaceC14715i;
/* renamed from: org.org.org.org.org.common.f */
/* loaded from: classes.dex */
public final class C14642f implements InterfaceC14636g {

    /* renamed from: a */
    public final InterfaceC14715i f32530a;

    /* renamed from: b */
    public String f32531b;

    /* renamed from: e */
    public final org.org.org.org.asm.tree.ByteVector f32532e;

    /* renamed from: l */
    public final C14643i f32533l;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14642f(InterfaceC14715i interfaceC14715i, org.org.org.org.asm.tree.ByteVector byteVector) {
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        Log_OC.getArray(byteVector, "debounceHandler");
        this.f32530a = interfaceC14715i;
        this.f32532e = byteVector;
        this.f32531b = "";
        C14643i $r3 = new C14643i(this);
        this.f32533l = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ C14648h m932a(C14642f c14642f, String $r3, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r3 = c14642f.f32531b;
        }
        C14648h $r1 = c14642f.m934a($r3);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m930d() {
        System $r3 = System.f32375c;
        LogAspect $r1 = LogAspect.IDENTIFICATION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r3.get($r1, false, $r2);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "storeAllModified() called, [logAspect: " + $r1 + ']';
            $r3.size($r1, $r2, "IdentificationHandler", $r6);
        }
        C14643i $r7 = this.f32533l;
        $r7.m923a();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14648h m934a(String str) {
        Log_OC.getArray(str, "visitorId");
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.IDENTIFICATION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, false, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "getIdentification() called with: visitorId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r2, $r3, "IdentificationHandler", $r82);
        }
        C14643i $r9 = this.f32533l;
        C14648h $r10 = $r9.m922a(str);
        if ($r10 != null) {
            return $r10;
        }
        TopLevel$NativeErrors $r52 = $r4.get($r2, false, $r3);
        int $i02 = $r52.ordinal();
        if ($i02 == 0) {
            String $r83 = "getIdentification() creating default identification, [logAspect: " + $r2 + ']';
            $r4.size($r2, $r3, "IdentificationHandler", $r83);
        }
        C14648h $r102 = new C14648h(null, null, null, 7, null);
        C14643i $r92 = this.f32533l;
        $r92.m921a(str, $r102);
        return $r102;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str, String str2, boolean z) {
        Log_OC.getArray(str, "key");
        Log_OC.getArray(str2, "value");
        JSONObject $r3 = new JSONObject();
        $r3.put(str, str2);
        m926d($r3, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: c */
    public org.org.org.org.org.asm.commons.JSONObject mo814c() {
        C14638a $r1 = new C14638a(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(UserProperties userProperties) {
        Log_OC.getArray(userProperties, "userProperties");
        MutableMapWithDefaultImpl r4 = (MutableMapWithDefaultImpl) userProperties;
        Expression $r2 = r4.toJSONObjectPair();
        JSONObject $r3 = $r2.getValue();
        m926d($r3, false);
        JSONObject $r32 = $r2.toJSON();
        m926d($r32, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m929d(Bundle bundle, boolean z) {
        Log_OC.getArray(bundle, "userProperties");
        C14607f $r3 = C14607f.f32363c;
        JSONObject $r1 = $r3.m1086a(bundle);
        m926d($r1, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m928d(String str) {
        Log_OC.getArray(str, "visitorId");
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.IDENTIFICATION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r2);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "setNewVisitorId() called with: visitorId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r4);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r3.size($r4, $r2, "IdentificationHandler", $r82);
        }
        String $r83 = this.f32531b;
        boolean $z0 = Log_OC.append($r83, "");
        if ($z0) {
            C14643i $r9 = this.f32533l;
            $r9.m919d(str);
        }
        this.f32531b = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m927d(String str, boolean z) {
        Log_OC.getArray(str, "userProperties");
        C14607f $r3 = C14607f.f32363c;
        JSONObject $r1 = $r3.get(str);
        m926d($r1, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m926d(JSONObject $r1, boolean z) {
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.IDENTIFICATION;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, true, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("setUserProperties() called with: ");
            $r7.append("userProperties = ");
            String $r8 = Log.get($r1, false, 2, null);
            $r7.append($r8);
            $r7.append(", ");
            $r7.append("immutable = ");
            $r7.append(z);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "IdentificationHandler", $r83);
        }
        if ($r1 == null) {
            LogAspect $r32 = LogAspect.MANDATORY;
            LogSeverity $r42 = LogSeverity.ERROR;
            TopLevel$NativeErrors $r52 = $r2.get($r32, false, $r42);
            int $i02 = $r52.ordinal();
            if ($i02 != 0) {
                return;
            }
            String $r84 = "setUserProperties() user properties cannot be null/empty!, [logAspect: " + $r32 + ']';
            $r2.size($r32, $r42, "IdentificationHandler", $r84);
            return;
        }
        C14607f $r9 = C14607f.f32363c;
        $r9.doInBackground($r1);
        C14643i $r10 = this.f32533l;
        String $r85 = this.f32531b;
        C14648h $r11 = $r10.m922a($r85);
        C14648h $r12 = $r11;
        if ($r11 == null) {
            $r12 = new C14648h(null, null, null, 7, null);
        }
        if (z) {
            TopLevel$NativeErrors $r53 = $r2.get($r3, true, $r4);
            int $i03 = $r53.ordinal();
            if ($i03 == 0) {
                String $r86 = "setUserProperties() immutable user properties updated, [logAspect: " + $r3 + ']';
                $r2.size($r3, $r4, "IdentificationHandler", $r86);
            }
            C14643i $r102 = this.f32533l;
            String $r87 = this.f32531b;
            JSONObject $r13 = $r12.m894h();
            JSONObject $r14 = $r9.toString($r13, $r1, true);
            JSONObject $r132 = $r14;
            if ($r14 == null) {
                $r132 = new JSONObject();
            }
            $r12.m896d($r132);
            $r102.m921a($r87, $r12);
            return;
        }
        TopLevel$NativeErrors $r54 = $r2.get($r3, true, $r4);
        int $i04 = $r54.ordinal();
        if ($i04 == 0) {
            String $r88 = "setUserProperties() mutable user properties updated, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r4, "IdentificationHandler", $r88);
        }
        C14643i $r103 = this.f32533l;
        String $r89 = this.f32531b;
        JSONObject $r133 = $r12.m899b();
        JSONObject $r15 = $r9.toString($r133, $r1, false);
        JSONObject $r134 = $r15;
        if ($r15 == null) {
            $r134 = new JSONObject();
        }
        $r12.m895e($r134);
        $r103.m921a($r89, $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: e */
    public String mo812e() {
        String $r1 = e.a.a.a.c.m.a.class.getCanonicalName();
        return $r1 != null ? $r1 : "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m925e(String $r1) {
        boolean $z0;
        Log_OC.getArray($r1, "userId");
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.IDENTIFICATION;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, true, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "setUserIdentifier() called with: userId = " + $r1;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r2.size($r3, $r4, "IdentificationHandler", $r82);
        }
        $z0 = C13276s.m5440u($r1);
        if ($z0) {
            LogAspect $r32 = LogAspect.MANDATORY;
            LogSeverity $r42 = LogSeverity.ERROR;
            TopLevel$NativeErrors $r52 = $r2.get($r32, false, $r42);
            int $i02 = $r52.ordinal();
            if ($i02 != 0) {
                return;
            }
            $r2.size($r32, $r42, "IdentificationHandler", "setUserIdentifier() user identifier cannot be empty/blank!, [logAspect: " + $r32 + ']');
            return;
        }
        C14643i $r9 = this.f32533l;
        String $r83 = this.f32531b;
        C14648h $r10 = $r9.m922a($r83);
        if ($r10 == null) {
            C14643i $r92 = this.f32533l;
            String $r84 = this.f32531b;
            $r92.m921a($r84, new C14648h($r1, null, null, 6, null));
            return;
        }
        C14643i $r93 = this.f32533l;
        String $r85 = this.f32531b;
        $r10.m898b($r1);
        $r93.m921a($r85, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final void m924i(String str) {
        Log_OC.getArray(str, "visitorId");
        System $r4 = System.f32375c;
        LogAspect $r2 = LogAspect.IDENTIFICATION;
        LogSeverity $r3 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r2, false, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            StringBuilder $r6 = new StringBuilder();
            String $r8 = "invalidateIdentification() called with: visitorId = " + str;
            $r6.append($r8);
            $r6.append(", [logAspect: ");
            $r6.append($r2);
            $r6.append(']');
            String $r82 = $r6.toString();
            $r4.size($r2, $r3, "IdentificationHandler", $r82);
        }
        C14643i $r9 = this.f32533l;
        $r9.add(str);
    }
}
