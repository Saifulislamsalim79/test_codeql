package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.smartlook.sdk.smartlook.core.bridge.model.WireframeData;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.asm.C14590m;
import org.org.org.org.asm.asm.Face;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.org.asm.InterfaceC14636g;
import org.org.org.org.org.asm.commons.JSONObject;
import org.org.org.org.org.core.base.C14665f;
import org.org.org.org.org.core.session.EnumC14680c;
import org.org.org.org.org.p602ui.C14724c;
import org.org.org.org.org.p602ui.C14726f;
/* renamed from: org.org.org.org.org.core.internal.asm.f */
/* loaded from: classes.dex */
public final class C14671f implements InterfaceC14636g {

    /* renamed from: a */
    public final ClassWriter f32658a;

    /* renamed from: b */
    public Bitmap f32659b;

    /* renamed from: c */
    public final C14665f f32660c;

    /* renamed from: d */
    public final C14724c f32661d;

    /* renamed from: e */
    public final C14726f f32662e;

    /* renamed from: f */
    public boolean f32663f;

    /* renamed from: i */
    public final org.org.org.org.org.jraf.Label f32664i;

    /* renamed from: j */
    public final Attribute f32665j;

    /* renamed from: l */
    public final Type f32666l;

    /* renamed from: m */
    public final org.org.org.org.org.data.Label f32667m;

    /* renamed from: w */
    public final AtomicBoolean f32668w;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14671f(org.org.org.org.org.data.Label label, Type type, ClassWriter classWriter, Attribute attribute, C14665f c14665f, C14724c c14724c, C14726f c14726f, org.org.org.org.org.jraf.Label label2) {
        Log_OC.getArray(label, "configurationHandler");
        Log_OC.getArray(type, "noRenderingScreenshotHandler");
        Log_OC.getArray(classWriter, "nativeScreenshotHandler");
        Log_OC.getArray(attribute, "bridgeWireframeScreenshotHandler");
        Log_OC.getArray(c14665f, "sensitivityHandler");
        Log_OC.getArray(c14724c, "simplificationHandler");
        Log_OC.getArray(c14726f, "renderingDataHandler");
        Log_OC.getArray(label2, "bridgeInterfaceHandler");
        this.f32667m = label;
        this.f32666l = type;
        this.f32658a = classWriter;
        this.f32665j = attribute;
        this.f32660c = c14665f;
        this.f32661d = c14724c;
        this.f32662e = c14726f;
        this.f32664i = label2;
        AtomicBoolean $r9 = new AtomicBoolean(false);
        this.f32668w = $r9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Bitmap m819a(List list, boolean[] zArr, Method method) {
        int $i0 = method.getValue();
        int $i1 = method.getName();
        Bitmap.Config $r4 = Bitmap.Config.ARGB_8888;
        Bitmap $r5 = Bitmap.createBitmap($i0, $i1, $r4);
        Canvas $r6 = new Canvas($r5);
        Bitmap $r7 = this.f32659b;
        boolean $z0 = this.f32663f;
        if (!$z0 || $r7 == null) {
            int $i12 = list.size();
            for (int $i02 = 0; $i02 < $i12; $i02++) {
                Object $r8 = list.get($i02);
                C14590m $r9 = (C14590m) $r8;
                $r6.save();
                Rect $r10 = $r9.m1119d();
                int $i2 = $r10.left;
                float $f0 = $i2;
                int $i22 = $r10.top;
                float $f1 = $i22;
                $r6.translate($f0, $f1);
                C14665f $r11 = this.f32660c;
                View $r12 = $r9.getName();
                if ($r12 == null) {
                    NullPointerException $r17 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    throw $r17;
                }
                ViewGroup $r13 = (ViewGroup) $r12;
                Map $r14 = $r11.add($r13);
                ClassWriter $r15 = this.f32658a;
                boolean $z02 = zArr[$i02];
                Log_OC.loadImage($r5, "bitmap");
                $r15.m836a($r9, $z02, $r6, $r5);
                C14665f $r112 = this.f32660c;
                View $r122 = $r9.getName();
                if ($r122 == null) {
                    NullPointerException $r172 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    throw $r172;
                }
                ViewGroup $r132 = (ViewGroup) $r122;
                Map $r16 = $r112.add($r132);
                C14665f $r113 = this.f32660c;
                $r113.add($r6, $r14, $r16);
                $r6.restore();
            }
            this.f32659b = $r5;
            Log_OC.loadImage($r5, "bitmap");
            return $r5;
        }
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Face m818a(InterfaceC11756a interfaceC11756a) throws Exception {
        AtomicBoolean $r3 = this.f32668w;
        $r3.set(true);
        try {
            try {
                Object $r1 = interfaceC11756a.invoke();
                Face $r4 = (Face) $r1;
                return $r4;
            } catch (Exception $r6) {
                throw $r6;
            }
        } finally {
            AtomicBoolean $r32 = this.f32668w;
            $r32.set(false);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        r6 = org.org.org.org.org.initializer.C14708f.f32807a;
        r8 = r6.m645j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        return r8;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.org.org.org.org.core.internal.asm.Label m820a() {
        /*
            r11 = this;
            org.org.org.org.org.data.Label r0 = r11.f32667m
            java.lang.String r1 = r0.get()
            int r2 = r1.hashCode()
            r3 = -941784056(0xffffffffc7dd8408, float:-113416.06)
            if (r2 == r3) goto L45
            r3 = -583889951(0xffffffffdd328be1, float:-8.0410151E17)
            if (r2 == r3) goto L3c
            r3 = 1297309261(0x4d535e4d, float:2.21635792E8)
            if (r2 == r3) goto L2d
            r3 = 1965271699(0x7523aa93, float:2.074717E32)
            if (r2 != r3) goto L54
            java.lang.String r5 = "blueprint"
            boolean r4 = r1.equals(r5)
            if (r4 == 0) goto L54
            org.org.org.org.org.initializer.f r6 = org.org.org.org.org.initializer.C14708f.f32807a
            org.org.org.org.org.core.internal.asm.Plot r7 = r6.equals()
            return r7
        L2d:
            java.lang.String r5 = "icon_blueprint"
            boolean r4 = r1.equals(r5)
            if (r4 == 0) goto L54
            org.org.org.org.org.initializer.f r6 = org.org.org.org.org.initializer.C14708f.f32807a
            org.org.org.org.org.core.internal.asm.Plot r7 = r6.setTitle()
            return r7
        L3c:
            java.lang.String r5 = "simplified_wireframe"
            boolean r4 = r1.equals(r5)
            if (r4 == 0) goto L54
            goto L4d
        L45:
            java.lang.String r5 = "wireframe"
            boolean r4 = r1.equals(r5)
            if (r4 == 0) goto L54
        L4d:
            org.org.org.org.org.initializer.f r6 = org.org.org.org.org.initializer.C14708f.f32807a
            org.org.org.org.org.core.internal.asm.h r8 = r6.m645j()
            return r8
        L54:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r5 = "Cannot obtain non native handler for \""
            r10.append(r5)
            r10.append(r1)
            java.lang.String r5 = "\" rendering mode"
            r10.append(r5)
            java.lang.String r1 = r10.toString()
            r9.<init>(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.asm.C14671f.m820a():org.org.org.org.org.core.internal.asm.Label");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Bitmap add(Method method) {
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.BRIDGE_WIREFRAME;
        LogSeverity $r5 = LogSeverity.DEBUG;
        org.org.org.org.asm.parser.TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        Bitmap $r7 = null;
        if ($i0 == 0) {
            StringBuilder $r8 = new StringBuilder();
            StringBuilder $r2 = new StringBuilder();
            $r2.append("captureBridgeWireframe() called with: displaySize = ");
            String $r9 = Log.get(method, false, 2, null);
            $r2.append($r9);
            String $r92 = $r2.toString();
            $r8.append($r92);
            $r8.append(", [logAspect: ");
            $r8.append($r4);
            $r8.append(']');
            String $r93 = $r8.toString();
            $r3.size($r4, $r5, "ScreenshotHandler", $r93);
        }
        org.org.org.org.org.jraf.Label $r10 = this.f32664i;
        WireframeData $r11 = $r10.m640a();
        if ($r11 != null) {
            float $f0 = $r11.getWidth();
            int $i02 = (int) $f0;
            float $f02 = $r11.getHeight();
            int $i1 = (int) $f02;
            Bitmap.Config $r12 = Bitmap.Config.ARGB_8888;
            Bitmap $r13 = Bitmap.createBitmap($i02, $i1, $r12);
            $r7 = $r13;
            Attribute $r14 = this.f32665j;
            List $r15 = $r11.getItems();
            Canvas $r16 = new Canvas($r13);
            $r14.m844a($r15, $r16);
        }
        if ($r7 != null) {
            return $r7;
        }
        Type $r17 = this.f32666l;
        Bitmap $r72 = $r17.get(method);
        return $r72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final String m811f() {
        org.org.org.org.org.data.Label $r2 = this.f32667m;
        String $r1 = $r2.get();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TopLevel$NativeErrors init() {
        org.org.org.org.org.data.Label $r1 = this.f32667m;
        String $r2 = $r1.get();
        org.org.org.org.org.data.Label $r12 = this.f32667m;
        boolean $z0 = $r12.copy();
        boolean $z1 = Log_OC.append($r2, "wireframe");
        if ($z1) {
            org.org.org.org.org.jraf.Label $r3 = this.f32664i;
            boolean $z12 = $r3.equals();
            if ($z12) {
                TopLevel$NativeErrors r6 = TopLevel$NativeErrors.Error;
                return r6;
            }
        }
        boolean $z13 = Log_OC.append($r2, "no_rendering");
        if ($z13 || $z0) {
            TopLevel$NativeErrors r62 = TopLevel$NativeErrors.ReferenceError;
            return r62;
        }
        boolean $z02 = Log_OC.append($r2, "native");
        if ($z02) {
            TopLevel$NativeErrors r63 = TopLevel$NativeErrors.EvalError;
            return r63;
        }
        boolean $z03 = Log_OC.append($r2, "blueprint");
        if (!$z03) {
            boolean $z04 = Log_OC.append($r2, "icon_blueprint");
            if (!$z04) {
                boolean $z05 = Log_OC.append($r2, "wireframe");
                if (!$z05) {
                    boolean $z06 = Log_OC.append($r2, "simplified_wireframe");
                    if (!$z06) {
                        Exception $r4 = new Exception("Cannot obtain screenshot handler category for \"" + $r2 + "\" rendering mode");
                        throw $r4;
                    }
                }
            }
        }
        TopLevel$NativeErrors r64 = TopLevel$NativeErrors.RangeError;
        return r64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Bitmap process(List list, Map map, Method method) {
        int $i0 = method.getValue();
        int $i1 = method.getName();
        Bitmap.Config $r4 = Bitmap.Config.ARGB_8888;
        Bitmap $r5 = Bitmap.createBitmap($i0, $i1, $r4);
        Canvas $r6 = new Canvas($r5);
        Label $r7 = m820a();
        Log_OC.loadImage($r5, "bitmap");
        $r7.m831a(list, $r6, $r5, map);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Face add(List list, boolean[] zArr, EnumC14680c enumC14680c) {
        Log_OC.getArray(list, "roots");
        Log_OC.getArray(zArr, "rootsToDraw");
        Log_OC.getArray(enumC14680c, "frameRotation");
        C14674i $r5 = new C14674i(this, enumC14680c, list, zArr);
        Face $r3 = m818a($r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean add() {
        AtomicBoolean $r1 = this.f32668w;
        boolean $z0 = $r1.get();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: c */
    public JSONObject mo814c() {
        C14666a $r1 = new C14666a(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: e */
    public String mo812e() {
        String $r1 = e.a.a.a.c.o.c.c.f.class.getCanonicalName();
        return $r1 != null ? $r1 : "";
    }
}
