package org.org.org.org.org.data;

import com.smartlook.sdk.smartlook.SetupOptions;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import com.smartlook.sdk.smartlook.core.renderingdata.annotation.WebGLRecordingMode;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13724q;
import lombok.org.asm.Number;
import org.org.org.org.asm.collision.InterfaceC14593a;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.asm.signature.InterfaceC14613a;
import org.org.org.org.org.C14705f;
import org.org.org.org.org.Context;
import org.org.org.org.org.Model;
import org.org.org.org.org.core.asm.ClassWriter;
import org.org.org.org.org.core.util.C14681a;
import org.org.org.org.org.core.util.Type;
import org.org.org.org.org.data.p601xy.C14699a;
import org.org.org.org.org.data.p601xy.C14701f;
import org.org.org.org.org.initializer.Frame;
import org.org.org.org.org.locale.api.AbstractTreeIterator;
import org.org.org.org.org.locale.api.Buffer;
import org.org.org.org.org.p602ui.login.Connection;
import org.org.org.org.org.p602ui.login.State;
/* loaded from: classes.dex */
public abstract class Log implements Number {

    /* renamed from: a */
    public final Context f32730a;

    /* renamed from: c */
    public final InterfaceC14593a f32731c;

    /* renamed from: l */
    public final InterfaceC14613a f32732l;

    public Log(InterfaceC14613a interfaceC14613a, Context context, InterfaceC14593a interfaceC14593a) {
        Log_OC.getArray(interfaceC14613a, "dispatcherProvider");
        Log_OC.getArray(context, "preferences");
        Log_OC.getArray(interfaceC14593a, "buildConfigStorage");
        this.f32732l = interfaceC14613a;
        this.f32730a = context;
        this.f32731c = interfaceC14593a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m738a(String $r1) {
        boolean $z0;
        boolean $z02;
        String $r12;
        String $r13;
        String $r2 = getText();
        $z0 = C13276s.m5447E($r1, "alfa_", false, 2, null);
        if ($z0) {
            Context $r3 = this.f32730a;
            $r13 = C13276s.m5451A($r1, "alfa_", "", false, 4, null);
            $r3.remove($r13, "SDK_SETTING_KEY");
            Frame $r4 = Frame.f32774d;
            lombok.org.libs.org.objectweb.asm.Attribute $r5 = $r4.get();
            $r5.m2138a(0);
        } else {
            $z02 = C13276s.m5447E($r1, "beta_", false, 2, null);
            if ($z02) {
                Context $r32 = this.f32730a;
                $r12 = C13276s.m5451A($r1, "beta_", "", false, 4, null);
                $r32.remove($r12, "SDK_SETTING_KEY");
                Frame $r42 = Frame.f32774d;
                lombok.org.libs.org.objectweb.asm.Attribute $r52 = $r42.get();
                $r52.m2138a(1);
            } else {
                Context $r33 = this.f32730a;
                $r33.remove($r1, "SDK_SETTING_KEY");
            }
        }
        boolean $z03 = Log_OC.append($r2, getText());
        if (!$z03) {
            setText();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r6 != false) goto L7;
     */
    /* JADX WARN: Incorrect condition in loop: B:11:0x0024 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m740a(com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode r13) {
        /*
            r12 = this;
            org.org.org.org.asm.collision.a r0 = r12.f32731c
            java.lang.String r1 = r0.mo1115a()
            com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode r2 = com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode.WIREFRAME
            r3 = 0
            if (r13 != r2) goto L3a
            org.org.org.org.org.ClassWriter r4 = org.org.org.org.org.ClassWriter.f32463b
            java.util.List r5 = r4.remove()
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L1c
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L1c
            goto L36
        L1c:
            java.util.Iterator r7 = r5.iterator()
        L20:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L36
            java.lang.Object r8 = r7.next()
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r9 = r10
            boolean r6 = kotlin.p483e0.p485d.Log_OC.append(r9, r1)
            if (r6 == 0) goto L20
            r6 = 0
            goto L37
        L36:
            r6 = 1
        L37:
            if (r6 == 0) goto L3a
            r3 = 1
        L3a:
            r11 = 1
            r3 = r3 ^ r11
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.data.Log.m740a(com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final boolean m736d() {
        InterfaceC14593a $r1 = this.f32731c;
        String $r2 = $r1.mo1115a();
        boolean $z0 = Log_OC.append($r2, "unreal");
        if ($z0) {
            return true;
        }
        boolean $z02 = Log_OC.append($r2, "unity");
        if ($z02) {
            return true;
        }
        boolean $z03 = Log_OC.append($r2, "unityLite");
        if ($z03) {
            return true;
        }
        boolean $z04 = Log_OC.append($r2, "cocos");
        if ($z04) {
            return true;
        }
        boolean $z05 = Log_OC.append($r2, "flutter");
        return $z05;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean log(String str) {
        boolean $z0 = Log_OC.append(str, "wireframe");
        if ($z0) {
            return true;
        }
        boolean $z02 = Log_OC.append(str, "blueprint");
        if ($z02) {
            return true;
        }
        boolean $z03 = Log_OC.append(str, "icon_blueprint");
        return $z03;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setText() {
        Context $r1 = this.f32730a;
        $r1.remove("SERVER_INTERNAL_RENDERING_MODE");
        Context $r12 = this.f32730a;
        $r12.remove("LAST_CHECK_FRAMERATE");
        Context $r13 = this.f32730a;
        $r13.remove("LAST_CHECK_BITRATE");
        Context $r14 = this.f32730a;
        $r14.remove("SERVER_ANALYTICS");
        Context $r15 = this.f32730a;
        $r15.remove("SERVER_IS_ALLOWED_RECORDING");
        Context $r16 = this.f32730a;
        $r16.remove("SERVER_IS_SENSITIVE");
        Context $r17 = this.f32730a;
        $r17.remove("SERVER_MAX_RECORD_DURATION");
        Context $r18 = this.f32730a;
        $r18.remove("SERVER_MAX_SESSION_DURATION");
        Context $r19 = this.f32730a;
        $r19.remove("SERVER_MOBILE_DATA");
        Context $r110 = this.f32730a;
        $r110.remove("SERVER_CAN_SWITCH_RENDERING_MODE");
        Context $r111 = this.f32730a;
        $r111.remove("SERVER_STORE_GROUP");
        Context $r112 = this.f32730a;
        $r112.remove("SERVER_WRITER_HOST");
        Context $r113 = this.f32730a;
        $r113.remove("SERVER_SESSION_TIMEOUT");
        Context $r114 = this.f32730a;
        $r114.remove("SERVER_RECORD_NETWORK");
        next();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final C14701f m742a() {
        Context $r2 = this.f32730a;
        String $r1 = $r2.toString("SERVER_VISITOR_URL_PATTERN");
        if ($r1 != null) {
            C14701f $r3 = new C14701f($r1);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m741a(SetupOptions setupOptions) {
        List $r2;
        Integer $r4;
        Log_OC.getArray(setupOptions, "setupOptions");
        List $r22 = setupOptions.getEventTrackingModes();
        Log_OC.loadImage($r22, "setupOptions.eventTrackingModes");
        boolean $z0 = $r22.isEmpty();
        if (!$z0) {
            List $r23 = setupOptions.getEventTrackingModes();
            Log_OC.loadImage($r23, "setupOptions.eventTrackingModes");
            read($r23);
        } else {
            EventTrackingMode $r3 = EventTrackingMode.FULL_TRACKING;
            $r2 = C13724q.m3901b($r3);
            read($r2);
        }
        boolean $z02 = setupOptions.isAdaptiveFramerateEnabled();
        m727f($z02);
        boolean $z03 = setupOptions.isExperimental();
        boolean $z1 = m736d();
        setText($z03, $z1);
        Integer $r42 = setupOptions.getFps();
        boolean $z04 = m739a($r42);
        if ($z04) {
            Integer $r43 = setupOptions.getFps();
            m731e($r43);
            $r4 = setupOptions.getFps();
        } else {
            $r4 = null;
        }
        int $i0 = write();
        Integer $r5 = Integer.valueOf($i0);
        ClassWriter.m879a($r4, $r5);
        RenderingMode $r6 = setupOptions.getRenderingMode();
        if ($r6 != null) {
            RenderingMode $r62 = setupOptions.getRenderingMode();
            RenderingModeOption $r7 = setupOptions.getRenderingModeOption();
            write($r62, $r7);
        } else {
            RenderingMode $r63 = RenderingMode.NATIVE;
            write($r63, null);
        }
        WebGLRecordingMode $r8 = setupOptions.getWebGLRecordingMode();
        write($r8);
        Context $r9 = this.f32730a;
        Enum $r10 = setupOptions.getCrashTrackingMode();
        Enum r12 = $r10;
        int $i02 = r12.ordinal();
        $r9.remove($i02, "CRASH_TRACKING_MODE");
        String $r11 = setupOptions.getSmartlookAPIKey();
        Log_OC.loadImage($r11, "setupOptions.smartlookAPIKey");
        m738a($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m739a(Integer num) {
        if (num != null) {
            int $i0 = num.intValue();
            if ($i0 >= 1) {
                int $i02 = num.intValue();
                return $i02 <= 10;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add(Type type) {
        Log_OC.getArray(type, "videoSize");
        C14705f $r2 = C14705f.f32765a;
        $r2.add(type, "SDK_VIDEO_SIZE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean add() {
        C14705f $r1 = C14705f.f32765a;
        boolean $z0 = Model.get((Context) $r1, "GL_SURFACE_CAPTURE", false, 2, (Object) null);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final List m737c() {
        EventTrackingMode.C7215a $r1 = EventTrackingMode.Companion;
        C14705f $r2 = C14705f.f32765a;
        byte $b0 = $r2.m689b();
        List $r3 = $r1.m19121c($b0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RenderingModeOption clear() {
        Buffer $r1 = AbstractTreeIterator.parent;
        String $r2 = get();
        RenderingModeOption $r3 = $r1.remove($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean close() {
        Context $r1 = this.f32730a;
        boolean $z0 = $r1.get("ADAPTIVE_FRAMERATE_ENABLED", true);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean copy() {
        Context $r1 = this.f32730a;
        boolean $z0 = $r1.get("SERVER_IS_SENSITIVE", false);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m735d(Integer num) {
        if (num == null) {
            Context $r1 = this.f32730a;
            $r1.remove("LAST_CHECK_FRAMERATE");
            return;
        }
        int $i0 = num.intValue();
        Context $r12 = this.f32730a;
        $r12.remove($i0, "LAST_CHECK_FRAMERATE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m734d(String str) {
        Log_OC.getArray(str, "value");
        Context $r2 = this.f32730a;
        $r2.remove(str, "SERVER_STORE_GROUP");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m733d(boolean z) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "SERVER_MOBILE_DATA");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // lombok.org.asm.Number
    /* renamed from: e */
    public InterfaceC11719g mo474e() {
        InterfaceC14613a $r2 = this.f32732l;
        InterfaceC11719g $r1 = $r2.mo1060a();
        InterfaceC11719g r3 = $r1;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m732e(int i) {
        Context $r1 = this.f32730a;
        $r1.remove(i, "SERVER_MAX_RECORD_DURATION");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m731e(Integer num) {
        if (num == null) {
            Context $r1 = this.f32730a;
            $r1.remove("SDK_FRAME_RATE");
            return;
        }
        int $i0 = num.intValue();
        Context $r12 = this.f32730a;
        $r12.remove($i0, "SDK_FRAME_RATE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m730e(String str) {
        Log_OC.getArray(str, "value");
        Context $r2 = this.f32730a;
        $r2.remove(str, "SERVER_SESSION_URL_PATTERN");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final void m729e(boolean z) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "SERVER_IS_ALLOWED_RECORDING");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final int m728f() {
        Context $r1 = this.f32730a;
        org.org.org.org.org.ClassWriter $r2 = org.org.org.org.org.ClassWriter.f32463b;
        long $l1 = $r2.m988f();
        int $i0 = (int) $l1;
        return $r1.get("SERVER_MAX_SESSION_DURATION", $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final void m727f(boolean z) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "ADAPTIVE_FRAMERATE_ENABLED");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String get() {
        Context $r1 = this.f32730a;
        String $r2 = $r1.toString("INTERNAL_RENDERING_MODE");
        String $r3 = $r2;
        if ($r2 == null) {
            Context $r12 = this.f32730a;
            $r3 = $r12.toString("SERVER_INTERNAL_RENDERING_MODE");
        }
        return $r3 != null ? $r3 : "native";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getColor() {
        Context $r1 = this.f32730a;
        Integer $r2 = $r1.get("LAST_CHECK_BITRATE");
        if ($r2 != null) {
            int $i0 = $r2.intValue();
            return $i0;
        }
        return 80000;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLog() {
        Context $r2 = this.f32730a;
        String $r1 = $r2.toString("SERVER_WRITER_HOST");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getSize() {
        Context $r1 = this.f32730a;
        org.org.org.org.org.ClassWriter $r2 = org.org.org.org.org.ClassWriter.f32463b;
        long $l1 = $r2.newUTF8();
        int $i0 = (int) $l1;
        return $r1.get("SERVER_MAX_RECORD_DURATION", $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final State getState() {
        Connection $r1 = State.service;
        WebGLRecordingMode $r2 = getString();
        State $r3 = $r1.getState($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WebGLRecordingMode getString() {
        Context $r1 = this.f32730a;
        String $r2 = $r1.toString("WEBGL_RECORDING_MODE");
        if ($r2 != null) {
            WebGLRecordingMode $r3 = WebGLRecordingMode.valueOf($r2);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getText() {
        Context $r2 = this.f32730a;
        String $r1 = Model.get($r2, "SDK_SETTING_KEY", (String) null, 2, (Object) null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C14699a getValue() {
        Context $r2 = this.f32730a;
        String $r1 = $r2.toString("SERVER_SESSION_URL_PATTERN");
        if ($r1 != null) {
            C14699a $r3 = new C14699a($r1);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final InterfaceC14613a m726i() {
        InterfaceC14613a r1 = this.f32732l;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void ignore(boolean z) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "SERVER_ANALYTICS");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long init() {
        Context $r1 = this.f32730a;
        org.org.org.org.org.ClassWriter $r2 = org.org.org.org.org.ClassWriter.f32463b;
        long $l0 = $r2.get();
        return $r1.get("SERVER_SESSION_TIMEOUT", $l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isEnabled() {
        Context $r1 = this.f32730a;
        boolean $z0 = $r1.get("SERVER_IS_ALLOWED_RECORDING", true);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: k */
    public final Context m725k() {
        Context r1 = this.f32730a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void next() {
        String $r2 = get();
        boolean $z0 = value();
        if ($z0) {
            return;
        }
        boolean $z02 = log($r2);
        if ($z02) {
            System $r3 = System.f32375c;
            LogAspect $r4 = LogAspect.MANDATORY;
            LogSeverity $r1 = LogSeverity.WARN;
            TopLevel$NativeErrors $r5 = $r3.get($r4, false, $r1);
            int $i0 = $r5.ordinal();
            if ($i0 == 0) {
                String $r22 = "validateRenderingModeAfterCheck(): Only POWER users can change rendering mode!, [logAspect: " + $r4 + ']';
                $r3.size($r4, $r1, "ConfigurationHandlerPreferencesBase", $r22);
            }
            write((String) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String print() {
        Context $r2 = this.f32730a;
        String $r1 = $r2.toString("SERVER_STORE_GROUP");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void print(int i) {
        Context $r1 = this.f32730a;
        $r1.remove(i, "SERVER_MAX_SESSION_DURATION");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void print(boolean z) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "SERVER_RECORD_NETWORK");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long put() {
        org.org.org.org.org.ClassWriter $r1 = org.org.org.org.org.ClassWriter.f32463b;
        long $l0 = $r1.set();
        return $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int read() {
        Context $r1 = this.f32730a;
        Integer $r2 = $r1.get("SDK_FRAME_RATE");
        if ($r2 != null) {
            int $i0 = $r2.intValue();
            return $i0;
        }
        int $i02 = write();
        return $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001e */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0045 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(java.util.List r17) {
        /*
            r16 = this;
            java.lang.String r1 = "eventTrackingMode"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            r0 = r17
            int r3 = kotlin.p557z.C13722p.m3921o(r0, r4)
            r2.<init>(r3)
            r0 = r17
            java.util.Iterator r5 = r0.iterator()
        L1a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3c
            java.lang.Object r7 = r5.next()
            r9 = r7
            com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode r9 = (com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode) r9
            r8 = r9
            byte r10 = r8.getCode()
            com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode r8 = com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode.FULL_TRACKING
            byte r11 = r8.getCode()
            r10 = r10 ^ r11
            byte r10 = (byte) r10
            java.lang.Byte r12 = java.lang.Byte.valueOf(r10)
            r2.add(r12)
            goto L1a
        L3c:
            r10 = 0
            java.util.Iterator r5 = r2.iterator()
        L41:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r7 = r5.next()
            r14 = r7
            java.lang.Number r14 = (java.lang.Number) r14
            r13 = r14
            byte r11 = r13.byteValue()
            r10 = r10 | r11
            goto L41
        L55:
            com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode r8 = com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode.FULL_TRACKING
            byte r11 = r8.getCode()
            r10 = r10 ^ r11
            r0 = r16
            org.org.org.org.org.Context r15 = r0.f32730a
            byte r10 = (byte) r10
            java.lang.String r1 = "EVENT_TRACKING_MODE"
            r15.remove(r10, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.data.Log.read(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void remove(String str) {
        Log_OC.getArray(str, "value");
        Context $r2 = this.f32730a;
        $r2.remove(str, "SERVER_VISITOR_URL_PATTERN");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean remove() {
        C14705f $r1 = C14705f.f32765a;
        boolean $z0 = Model.get((Context) $r1, "SDK_EXPERIMENTAL", false, 2, (Object) null);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RenderingMode reset() {
        Buffer $r1 = AbstractTreeIterator.parent;
        String $r2 = get();
        RenderingMode $r3 = $r1.show($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: s */
    public final boolean m724s() {
        Context $r1 = this.f32730a;
        boolean $z0 = $r1.get("SERVER_MOBILE_DATA", false);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Type setEnabled() {
        C14705f $r3 = C14705f.f32765a;
        C14681a $r1 = Type.f32698b;
        Object $r2 = $r3.add("SDK_VIDEO_SIZE", $r1);
        Type $r4 = (Type) $r2;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setText(int i) {
        Context $r1 = this.f32730a;
        $r1.remove(i, "LAST_CHECK_BITRATE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setText(String str) {
        Log_OC.getArray(str, "value");
        Context $r2 = this.f32730a;
        $r2.remove(str, "SERVER_WRITER_HOST");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setText(boolean z) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "SERVER_CAN_SWITCH_RENDERING_MODE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setText(boolean z, boolean z2) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "SDK_EXPERIMENTAL");
        Context $r12 = this.f32730a;
        boolean $z0 = z2 || z;
        $r12.remove($z0, "GL_SURFACE_CAPTURE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean value() {
        Context $r1 = this.f32730a;
        boolean $z0 = $r1.get("SERVER_CAN_SWITCH_RENDERING_MODE", true);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: w */
    public final boolean m723w() {
        Context $r1 = this.f32730a;
        boolean $z0 = $r1.get("SERVER_RECORD_NETWORK", true);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int write() {
        Context $r1 = this.f32730a;
        Integer $r2 = $r1.get("LAST_CHECK_FRAMERATE");
        if ($r2 != null) {
            int $i0 = $r2.intValue();
            return $i0;
        }
        return 2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(long j) {
        Context $r1 = this.f32730a;
        $r1.add(j, "SERVER_SESSION_TIMEOUT");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(RenderingMode renderingMode, RenderingModeOption renderingModeOption) {
        String $r8;
        int $i0;
        if (renderingMode != null) {
            boolean $z0 = m740a(renderingMode);
            if (!$z0) {
                System $r3 = System.f32375c;
                LogAspect $r4 = LogAspect.MANDATORY;
                LogSeverity $r5 = LogSeverity.WARN;
                TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
                if ($r6.ordinal() != 0) {
                    return;
                }
                String $r82 = "setRenderingMethod(): wireframe rendering mode only allowed on Native and React!, [logAspect: " + $r4 + ']';
                $r3.size($r4, $r5, "ConfigurationHandlerPreferencesBase", $r82);
                return;
            }
        }
        boolean $z02 = value();
        if (!$z02) {
            RenderingMode $r9 = RenderingMode.WIREFRAME;
            if (renderingMode == $r9) {
                System $r32 = System.f32375c;
                LogAspect $r42 = LogAspect.MANDATORY;
                LogSeverity $r52 = LogSeverity.WARN;
                TopLevel$NativeErrors $r62 = $r32.get($r42, false, $r52);
                if ($r62.ordinal() != 0) {
                    return;
                }
                String $r83 = "setRenderingMethod(): only POWER users can change rendering mode!, [logAspect: " + $r42 + ']';
                $r32.size($r42, $r52, "ConfigurationHandlerPreferencesBase", $r83);
                return;
            }
        }
        if (renderingMode != null) {
            int $i02 = renderingMode.ordinal();
            if ($i02 == 0 || $i02 == 1) {
                if (renderingModeOption != null) {
                    System $r33 = System.f32375c;
                    LogAspect $r43 = LogAspect.MANDATORY;
                    LogSeverity $r53 = LogSeverity.WARN;
                    TopLevel$NativeErrors $r63 = $r33.get($r43, false, $r53);
                    if ($r63.ordinal() == 0) {
                        String $r84 = "setRenderingMethod(): invalid combination of renderingMode and renderingModeOption!, [logAspect: " + $r43 + ']';
                        $r33.size($r43, $r53, "ConfigurationHandlerPreferencesBase", $r84);
                    }
                    $r8 = null;
                } else {
                    $r8 = renderingMode.getCode();
                }
            } else if ($i02 == 2) {
                if (renderingModeOption == null || ($i0 = renderingModeOption.ordinal()) == 0) {
                    $r8 = "wireframe";
                } else if ($i0 == 1) {
                    $r8 = "blueprint";
                } else if ($i0 == 2) {
                    $r8 = "icon_blueprint";
                } else if ($i0 != 3) {
                    Throwable r12 = new NoWhenBranchMatchedException();
                    Throwable r13 = r12;
                    throw r13;
                } else {
                    $r8 = "simplified_wireframe";
                }
            }
            write($r8);
        }
        System $r34 = System.f32375c;
        LogAspect $r44 = LogAspect.MANDATORY;
        LogSeverity $r54 = LogSeverity.WARN;
        TopLevel$NativeErrors $r64 = $r34.get($r44, false, $r54);
        if ($r64.ordinal() == 0) {
            String $r85 = "setRenderingMethod(): you have entered invalid rendering method!, [logAspect: " + $r44 + ']';
            $r34.size($r44, $r54, "ConfigurationHandlerPreferencesBase", $r85);
        }
        $r8 = null;
        write($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(WebGLRecordingMode webGLRecordingMode) {
        if (webGLRecordingMode != null) {
            WebGLRecordingMode $r3 = WebGLRecordingMode.WEBGL_ONLY;
            if (webGLRecordingMode == $r3) {
                RenderingMode $r4 = RenderingMode.NO_RENDERING;
                write($r4, null);
            }
            Context $r5 = this.f32730a;
            WebGLRecordingMode r6 = webGLRecordingMode;
            String $r1 = r6.name();
            $r5.remove($r1, "WEBGL_RECORDING_MODE");
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(String str) {
        Context $r2 = this.f32730a;
        $r2.remove(str, "INTERNAL_RENDERING_MODE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(boolean z) {
        Context $r1 = this.f32730a;
        $r1.remove(z, "SERVER_IS_SENSITIVE");
    }
}
