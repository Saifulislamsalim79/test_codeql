package org.org.org.org.org.data;

import a.a.a.f.a;
import android.media.MediaCodecInfo;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p485d.Log_OC;
import lombok.org.asm.SignatureReader;
import lombok.org.asm.menu.C14295x;
import lombok.org.asm.menu.InterfaceC14282e;
import lombok.org.asm.signature.C14308x;
import lombok.org.asm.signature.Item;
import lombok.org.libs.org.objectweb.asm.asm.Handle;
import lombok.org.libs.org.objectweb.asm.asm.Sequence;
import lombok.org.libs.org.objectweb.asm.asm.Type;
import lombok.org.libs.org.objectweb.tree.C14335c;
import org.org.org.org.asm.collision.InterfaceC14593a;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.asm.signature.InterfaceC14613a;
import org.org.org.org.internal.app.api.C14624h;
import org.org.org.org.org.Context;
import org.org.org.org.org.common.screens.InterfaceC14645a;
import org.org.org.org.org.core.asm.ClassWriter;
import org.org.org.org.org.data.p601xy.C14699a;
import org.org.org.org.org.data.p601xy.C14701f;
import org.org.org.org.org.data.p601xy.InterfaceC14702h;
import org.org.org.org.org.menu.InterfaceC14715i;
import org.org.org.org.org.menu.ListPopupWindow$ForwardingListener;
/* loaded from: classes.dex */
public final class Label extends Log {

    /* renamed from: a */
    public final Attribute f32720a;

    /* renamed from: b */
    public final HashSet<String> f32721b;

    /* renamed from: c */
    public InterfaceC14702h f32722c;

    /* renamed from: d */
    public final InterfaceC14715i f32723d;

    /* renamed from: e */
    public final InterfaceC11824h f32724e;

    /* renamed from: f */
    public final C14335c f32725f;

    /* renamed from: g */
    public final a<C13666w> f32726g;

    /* renamed from: i */
    public final AtomicBoolean f32727i;

    /* renamed from: j */
    public final InterfaceC14645a f32728j;

    /* renamed from: k */
    public final a.a.a.a2.e<C13666w> f32729k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label(C14335c c14335c, InterfaceC14613a interfaceC14613a, Attribute attribute, Context context, InterfaceC14593a interfaceC14593a, InterfaceC14715i interfaceC14715i, InterfaceC14645a interfaceC14645a) {
        super(interfaceC14613a, context, interfaceC14593a);
        InterfaceC11824h $r13;
        Log_OC.getArray(c14335c, "checkRecordingConfigApiHandler");
        Log_OC.getArray(interfaceC14613a, "dispatcherProvider");
        Log_OC.getArray(attribute, "sessionConfigurationStorage");
        Log_OC.getArray(context, "preferences");
        Log_OC.getArray(interfaceC14593a, "buildConfigStorage");
        Log_OC.getArray(interfaceC14715i, "sdkStorageHandler");
        Log_OC.getArray(interfaceC14645a, "sessionStorage");
        this.f32725f = c14335c;
        this.f32720a = attribute;
        this.f32723d = interfaceC14715i;
        this.f32728j = interfaceC14645a;
        InterfaceC14282e $r8 = C14295x.m2196a(1);
        this.f32729k = $r8;
        Item $r9 = C14308x.m2176a($r8);
        this.f32726g = $r9;
        HashSet $r10 = new HashSet();
        this.f32721b = $r10;
        AtomicBoolean $r11 = new AtomicBoolean(false);
        this.f32727i = $r11;
        C14697b $r12 = C14697b.f32741a;
        $r13 = C13218k.m5625b($r12);
        this.f32724e = $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final org.org.org.org.org.data.asm.Attribute m755a(String str, org.org.org.org.org.data.asm.Attribute attribute) {
        org.org.org.org.org.data.asm.Label $r2 = attribute != null ? attribute.m721a() : null;
        if ($r2 == null) {
            boolean $z0 = attribute != null ? attribute.getValue() : isEnabled();
            org.org.org.org.org.data.asm.Attribute $r4 = new org.org.org.org.org.data.asm.Attribute($z0, null);
            String $r5 = getLog();
            String $r6 = print();
            if ($r5 != null && $r6 != null) {
                org.org.org.org.org.data.asm.Label $r22 = new org.org.org.org.org.data.asm.Label($r5, $r6);
                org.org.org.org.org.data.asm.Attribute $r7 = org.org.org.org.org.data.asm.Attribute.m720a($r4, false, $r22, 1, null);
                $r4 = $r7;
                if (attribute != null) {
                    Attribute $r8 = this.f32720a;
                    $r8.write(str, $r7);
                }
            }
            if (attribute == null) {
                Attribute $r82 = this.f32720a;
                $r82.write(str, $r4);
            }
            return $r4;
        }
        return attribute;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m757a(String str, String str2) {
        AtomicBoolean $r4 = this.f32727i;
        boolean $z0 = $r4.getAndSet(true);
        if ($z0) {
            return;
        }
        InterfaceC14613a $r5 = m726i();
        InterfaceC11719g $r6 = $r5.mo1060a();
        C14698e r7 = new C14698e(this, str2, str, null);
        InterfaceC11719g r8 = $r6;
        SignatureReader.m2355a(this, r8, null, r7, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m756a(String str, org.org.org.org.internal.app.api.Label label) {
        if (label != null) {
            String $r3 = label.getName();
            String $r4 = label.m1018e();
            m743e($r3, $r4);
            C14624h $r5 = label.m1019c();
            if ($r5 == null) {
                HashSet $r6 = this.f32721b;
                boolean $z0 = $r6.contains(str);
                boolean $z1 = label.m1020b();
                m750a($z0, str, $z1, null);
                return;
            }
            boolean $z02 = label.m1020b();
            m749a($z02, $r5);
            HashSet $r62 = this.f32721b;
            boolean $z03 = $r62.contains(str);
            boolean $z12 = label.m1020b();
            m750a($z03, str, $z12, $r5);
            boolean $z04 = label.m1020b();
            m745b($z04, $r5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m754a(Sequence sequence) {
        boolean $z0 = sequence instanceof Handle;
        if ($z0) {
            System $r2 = System.f32375c;
            LogAspect $r3 = LogAspect.MANDATORY;
            LogSeverity $r4 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
            int $i0 = $r5.ordinal();
            if ($i0 != 0) {
                return;
            }
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("setup() error: code = ");
            Handle $r8 = (Handle) sequence;
            int $i02 = $r8.getName();
            $r7.append($i02);
            $r7.append(", message = ");
            org.org.org.org.internal.app.Label $r9 = $r8.m2122a();
            String $r10 = $r9 != null ? $r9.m1022a() : null;
            $r7.append($r10);
            String $r102 = $r7.toString();
            $r6.append($r102);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r103 = $r6.toString();
            $r2.size($r3, $r4, "ConfigurationHandler", $r103);
            return;
        }
        boolean $z02 = sequence instanceof Type;
        if ($z02) {
            Type $r11 = (Type) sequence;
            Object $r12 = $r11.getValue();
            if ($r12 != null) {
                Object $r122 = $r11.getValue();
                org.org.org.org.internal.app.api.Label $r13 = (org.org.org.org.internal.app.api.Label) $r122;
                boolean $z03 = $r13.m1020b();
                if ($z03) {
                    return;
                }
                Object $r123 = $r11.getValue();
                org.org.org.org.internal.app.api.Label $r132 = (org.org.org.org.internal.app.api.Label) $r123;
                org.org.org.org.internal.app.Label $r92 = $r132.m1021a();
                if ($r92 != null) {
                    System $r22 = System.f32375c;
                    LogAspect $r32 = LogAspect.MANDATORY;
                    LogSeverity $r42 = LogSeverity.DEBUG;
                    TopLevel$NativeErrors $r52 = $r22.get($r32, false, $r42);
                    int $i03 = $r52.ordinal();
                    if ($i03 != 0) {
                        return;
                    }
                    StringBuilder $r62 = new StringBuilder();
                    StringBuilder $r72 = new StringBuilder();
                    $r72.append("setup() error: code = ");
                    int $i04 = $r11.m2119a();
                    $r72.append($i04);
                    $r72.append(", message = ");
                    Object $r124 = $r11.getValue();
                    org.org.org.org.internal.app.api.Label $r133 = (org.org.org.org.internal.app.api.Label) $r124;
                    org.org.org.org.internal.app.Label $r93 = $r133.m1021a();
                    String $r104 = $r93.m1022a();
                    $r72.append($r104);
                    String $r105 = $r72.toString();
                    $r62.append($r105);
                    $r62.append(", [logAspect: ");
                    $r62.append($r32);
                    $r62.append(']');
                    String $r106 = $r62.toString();
                    $r22.size($r32, $r42, "ConfigurationHandler", $r106);
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m750a(boolean z, String str, boolean z2, C14624h c14624h) {
        Attribute $r3 = this.f32720a;
        org.org.org.org.org.data.asm.Attribute $r4 = $r3.remove(str);
        org.org.org.org.org.data.asm.Label $r5 = null;
        if (z) {
            Attribute $r32 = this.f32720a;
            if (c14624h != null) {
                String $r6 = c14624h.m1006c();
                String $r7 = c14624h.m1004e();
                $r5 = new org.org.org.org.org.data.asm.Label($r6, $r7);
            }
            $r32.write(str, new org.org.org.org.org.data.asm.Attribute(z2, $r5));
        } else if ($r4 == null) {
            Attribute $r33 = this.f32720a;
            boolean $z0 = isEnabled();
            if (c14624h != null) {
                String $r62 = c14624h.m1006c();
                String $r72 = c14624h.m1004e();
                $r5 = new org.org.org.org.org.data.asm.Label($r62, $r72);
            }
            $r33.write(str, new org.org.org.org.org.data.asm.Attribute($z0, $r5));
        } else {
            org.org.org.org.org.data.asm.Label $r8 = $r4.m721a();
            if ($r8 == null) {
                Attribute $r34 = this.f32720a;
                boolean $z02 = $r4.getValue();
                if (c14624h != null) {
                    String $r63 = c14624h.m1006c();
                    String $r73 = c14624h.m1004e();
                    $r5 = new org.org.org.org.org.data.asm.Label($r63, $r73);
                }
                $r34.write(str, new org.org.org.org.org.data.asm.Attribute($z02, $r5));
            }
        }
        a.a.a.a2.e<C13666w> eVar = this.f32729k;
        C13666w $r10 = C13666w.f30112a;
        eVar.offer($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0049 */
    /* JADX WARN: Incorrect condition in loop: B:23:0x00c9 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0019 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m749a(boolean r31, org.org.org.org.internal.app.api.C14624h r32) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.data.Label.m749a(boolean, org.org.org.org.internal.app.api.h):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final void m745b(boolean z, C14624h c14624h) {
        Integer $r4;
        Context $r2 = m725k();
        String $r3 = c14624h.m1005d();
        $r2.remove($r3, "SERVER_INTERNAL_RENDERING_MODE");
        int $i0 = c14624h.getGroupId();
        Integer $r42 = Integer.valueOf($i0);
        m735d($r42);
        int $i02 = c14624h.m1007b();
        setText($i02);
        boolean $z1 = c14624h.m1002i();
        ignore($z1);
        m729e(z);
        boolean $z0 = c14624h.getValue();
        write($z0);
        long $l1 = c14624h.getItemId();
        int $i03 = (int) $l1;
        m732e($i03);
        long $l12 = c14624h.m1001l();
        int $i04 = (int) $l12;
        print($i04);
        boolean $z02 = c14624h.m1008a();
        m733d($z02);
        boolean $z03 = c14624h.m1003f();
        setText($z03);
        String $r32 = c14624h.m1004e();
        m734d($r32);
        String $r33 = c14624h.m1006c();
        setText($r33);
        long $l13 = c14624h.getCount();
        write($l13);
        boolean $z04 = c14624h.m1000m();
        print($z04);
        int $i05 = c14624h.getGroupId();
        Integer $r43 = Integer.valueOf($i05);
        boolean $z05 = m739a($r43);
        if ($z05) {
            int $i06 = c14624h.getGroupId();
            $r4 = Integer.valueOf($i06);
        } else {
            $r4 = null;
        }
        int $i07 = c14624h.m1007b();
        ClassWriter.m884a($i07, $r4);
        next();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final MediaCodecInfo m744d() {
        InterfaceC11824h $r2 = this.f32724e;
        Object $r1 = $r2.getValue();
        MediaCodecInfo $r3 = (MediaCodecInfo) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    private final void m743e(String str, String str2) {
        if (str != null) {
            m730e(str);
            InterfaceC14702h $r4 = this.f32722c;
            if ($r4 != null) {
                C14699a $r2 = new C14699a(str);
                $r4.mo704a($r2);
            }
        }
        if (str2 != null) {
            remove(str2);
            InterfaceC14702h $r42 = this.f32722c;
            if ($r42 != null) {
                C14701f $r5 = new C14701f(str2);
                $r42.mo703a($r5);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m758a(String str) {
        Log_OC.getArray(str, "sessionId");
        org.org.org.org.org.data.asm.Attribute $r2 = add(str, null);
        InterfaceC14715i $r3 = this.f32723d;
        ListPopupWindow$ForwardingListener $r4 = $r3.mo549d();
        boolean $z0 = $r4 instanceof org.org.org.org.org.menu.Handle;
        if ($z0) {
            InterfaceC14645a $r5 = this.f32728j;
            org.org.org.org.org.menu.Handle $r6 = (org.org.org.org.org.menu.Handle) $r4;
            String $r1 = $r6.getDesc();
            $r5.add($r1);
        }
        boolean $z02 = $r2.getValue();
        if ($z02) {
            org.org.org.org.org.menu.ClassWriter $r7 = org.org.org.org.org.menu.ClassWriter.f32848b;
            boolean $z03 = Log_OC.append($r4, $r7);
            if (!$z03) {
                MediaCodecInfo $r8 = m744d();
                return $r8 != null;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.data.asm.Attribute add(String str, String str2) {
        Log_OC.getArray(str, "sessionId");
        Attribute $r3 = this.f32720a;
        org.org.org.org.org.data.asm.Attribute $r4 = m755a(str, $r3.remove(str));
        org.org.org.org.org.data.asm.Label $r5 = $r4.m721a();
        if ($r5 == null && str2 != null) {
            m757a(str, str2);
        }
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(String str) {
        Log_OC.getArray(str, "sessionId");
        HashSet $r2 = this.f32721b;
        $r2.remove(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final Item m748b() {
        return this.f32726g;
    }

    /* renamed from: b */
    public final void m746b(InterfaceC14702h interfaceC14702h) {
        this.f32722c = interfaceC14702h;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set(String str, String str2) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(str2, "visitorId");
        HashSet $r4 = this.f32721b;
        $r4.add(str);
        Attribute $r5 = this.f32720a;
        org.org.org.org.org.data.asm.Attribute $r3 = $r5.remove(str);
        m755a(str, $r3);
        m757a(str, str2);
    }
}
