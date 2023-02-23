package org.org.org.org.org.asm;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
/* renamed from: org.org.org.org.org.asm.d */
/* loaded from: classes.dex */
public final class C14633d extends FragmentManager.AbstractC1439j {

    /* renamed from: j */
    public final /* synthetic */ C14635f f32494j;

    /* renamed from: k */
    public boolean f32495k;

    public C14633d(C14635f c14635f) {
        this.f32494j = c14635f;
    }

    /* renamed from: b */
    public final void m975b(boolean z) {
        this.f32495k = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentManager.AbstractC1439j
    /* renamed from: f */
    public void mo974f(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fragmentManager");
        Log_OC.getArray(fragment, "fragment");
        boolean $z0 = this.f32495k;
        if ($z0) {
            return;
        }
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.LIFECYCLE;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("onFragmentPaused() called with: ");
            $r8.append("fragment = ");
            String $r9 = Log.get(fragment, false, 2, null);
            $r8.append($r9);
            $r8.append("\", ");
            $r8.append("fragmentManager = ");
            String $r92 = Log.get(fragmentManager, false, 2, null);
            $r8.append($r92);
            String $r93 = $r8.toString();
            $r7.append($r93);
            $r7.append(", [logAspect: ");
            $r7.append($r4);
            $r7.append(']');
            String $r94 = $r7.toString();
            $r3.size($r4, $r5, "SDKLifecycleHandler", $r94);
        }
        C14635f $r10 = this.f32494j;
        C14632c $r11 = $r10.f32502b;
        d$a$a $r12 = new d$a$a(fragmentManager, fragment);
        C14632c.m978a($r11, null, null, $r12, 3, null);
        super.mo974f(fragmentManager, fragment);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentManager.AbstractC1439j
    /* renamed from: i */
    public void mo973i(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fragmentManager");
        Log_OC.getArray(fragment, "fragment");
        boolean $z0 = this.f32495k;
        if ($z0) {
            return;
        }
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.LIFECYCLE;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("onFragmentResumed() called with: ");
            $r8.append("fragment = ");
            String $r9 = Log.get(fragment, false, 2, null);
            $r8.append($r9);
            $r8.append(", ");
            $r8.append("fragmentManager = ");
            String $r92 = Log.get(fragmentManager, false, 2, null);
            $r8.append($r92);
            String $r93 = $r8.toString();
            $r7.append($r93);
            $r7.append(", [logAspect: ");
            $r7.append($r4);
            $r7.append(']');
            String $r94 = $r7.toString();
            $r3.size($r4, $r5, "SDKLifecycleHandler", $r94);
        }
        C14635f $r10 = this.f32494j;
        C14632c $r11 = $r10.f32502b;
        d$a$b $r12 = new d$a$b(fragmentManager, fragment);
        C14632c.m978a($r11, null, null, $r12, 3, null);
        super.mo973i(fragmentManager, fragment);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentManager.AbstractC1439j
    /* renamed from: k */
    public void mo972k(FragmentManager fragmentManager, Fragment fragment) {
        Log_OC.getArray(fragmentManager, "fragmentManager");
        Log_OC.getArray(fragment, "fragment");
        boolean $z0 = this.f32495k;
        if ($z0) {
            return;
        }
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.LIFECYCLE;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r7 = new StringBuilder();
            StringBuilder $r8 = new StringBuilder();
            $r8.append("onFragmentStarted() called with: ");
            $r8.append("fragment = ");
            String $r9 = Log.get(fragment, false, 2, null);
            $r8.append($r9);
            $r8.append(", ");
            $r8.append("fragmentManager = ");
            String $r92 = Log.get(fragmentManager, false, 2, null);
            $r8.append($r92);
            String $r93 = $r8.toString();
            $r7.append($r93);
            $r7.append(", [logAspect: ");
            $r7.append($r4);
            $r7.append(']');
            String $r94 = $r7.toString();
            $r3.size($r4, $r5, "SDKLifecycleHandler", $r94);
        }
        C14635f $r10 = this.f32494j;
        C14632c $r11 = $r10.f32502b;
        d$a$c $r12 = new d$a$c(fragmentManager, fragment);
        C14632c.m978a($r11, null, null, $r12, 3, null);
        super.mo972k(fragmentManager, fragment);
    }
}
