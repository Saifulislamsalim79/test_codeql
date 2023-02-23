package org.org.org.org.asm.parser;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.smartlook.sdk.smartlook.SetupOptions;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import com.smartlook.sdk.smartlook.core.session.model.UserProperties;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMask;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMaskElement;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.SmartlookSensitivity;
import com.smartlook.sdk.smartlook.integration.model.Integration;
import com.smartlook.sdk.smartlook.integration.segment.SegmentMiddlewareOption;
import java.io.File;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
import org.json.JSONObject;
import org.org.org.org.android.util.asm.C14542f;
import org.org.org.org.android.util.asm.C14544h;
import org.org.org.org.android.util.asm.C14545i;
import org.org.org.org.android.util.asm.C14547m;
import org.org.org.org.android.util.asm.Item;
import org.org.org.org.android.util.asm.Key;
import org.org.org.org.android.util.asm.Location;
import org.org.org.org.android.util.asm.Node;
import org.org.org.org.asm.asm.C14590m;
import org.org.org.org.asm.asm.Method;
import org.org.org.org.org.core.util.Type;
import org.org.org.org.xml.core.util.Context;
/* loaded from: classes.dex */
public final class Log {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public static final String m1065e(List list) {
        String $r0 = toString(list, false, false, 6, (java.lang.Object) null);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public static final String m1064e(java.lang.Object[] objArr) {
        String $r0 = toString(objArr, false, false, 6, (java.lang.Object) null);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String get(java.lang.Object obj, boolean z) {
        if (obj == null) {
            return "null";
        }
        boolean $z1 = obj instanceof Class;
        try {
            if ($z1) {
                Attribute $r2 = Attribute.f32368a;
                Class $r3 = (Class) obj;
                return $r2.getName($r3);
            }
            boolean $z12 = obj instanceof Activity;
            if ($z12) {
                Attribute $r22 = Attribute.f32368a;
                Activity $r5 = (Activity) obj;
                return $r22.apply($r5);
            }
            boolean $z13 = obj instanceof View;
            if ($z13) {
                Attribute $r23 = Attribute.f32368a;
                View $r6 = (View) obj;
                return $r23.get($r6);
            }
            boolean $z14 = obj instanceof Window;
            if ($z14) {
                Attribute $r24 = Attribute.f32368a;
                Window $r7 = (Window) obj;
                return $r24.getString($r7);
            }
            boolean $z15 = obj instanceof PopupWindow;
            if ($z15) {
                Attribute $r25 = Attribute.f32368a;
                PopupWindow $r8 = (PopupWindow) obj;
                return $r25.getString($r8);
            }
            boolean $z16 = obj instanceof DisplayMetrics;
            if ($z16) {
                Attribute $r26 = Attribute.f32368a;
                DisplayMetrics $r9 = (DisplayMetrics) obj;
                return $r26.toString($r9);
            }
            boolean $z17 = obj instanceof Key;
            if ($z17) {
                Attribute $r27 = Attribute.f32368a;
                Key $r10 = (Key) obj;
                return $r27.toString($r10);
            }
            boolean $z18 = obj instanceof org.org.org.org.android.util.asm.Label;
            if ($z18) {
                Attribute $r28 = Attribute.f32368a;
                org.org.org.org.android.util.asm.Label $r11 = (org.org.org.org.android.util.asm.Label) obj;
                return $r28.write($r11);
            }
            boolean $z19 = obj instanceof MotionEvent;
            if ($z19) {
                Attribute $r29 = Attribute.f32368a;
                MotionEvent $r12 = (MotionEvent) obj;
                return $r29.process($r12);
            }
            boolean $z110 = obj instanceof Location;
            if ($z110) {
                Attribute $r210 = Attribute.f32368a;
                Location $r13 = (Location) obj;
                return $r210.toString($r13);
            }
            boolean $z111 = obj instanceof C14547m;
            if ($z111) {
                Attribute $r211 = Attribute.f32368a;
                C14547m $r14 = (C14547m) obj;
                return $r211.m1074a($r14);
            }
            boolean $z112 = obj instanceof C14542f;
            if ($z112) {
                Attribute $r212 = Attribute.f32368a;
                C14542f $r15 = (C14542f) obj;
                return $r212.get($r15);
            }
            boolean $z113 = obj instanceof C14545i;
            if ($z113) {
                Attribute $r213 = Attribute.f32368a;
                C14545i $r16 = (C14545i) obj;
                return $r213.get($r16);
            }
            boolean $z114 = obj instanceof C14544h;
            if ($z114) {
                Attribute $r214 = Attribute.f32368a;
                C14544h $r17 = (C14544h) obj;
                return $r214.m1075a($r17);
            }
            boolean $z115 = obj instanceof ViewState;
            if ($z115) {
                Attribute $r215 = Attribute.f32368a;
                ViewState $r18 = (ViewState) obj;
                return $r215.toString($r18);
            }
            boolean $z116 = obj instanceof ViewType;
            if ($z116) {
                Attribute $r216 = Attribute.f32368a;
                ViewType $r19 = (ViewType) obj;
                return $r216.getString($r19);
            }
            boolean $z117 = obj instanceof Rect;
            if ($z117) {
                Attribute $r217 = Attribute.f32368a;
                Rect $r20 = (Rect) obj;
                return $r217.get($r20);
            }
            boolean $z118 = obj instanceof Drawable;
            if ($z118) {
                Attribute $r218 = Attribute.f32368a;
                Drawable $r21 = (Drawable) obj;
                return $r218.getString($r21);
            }
            boolean $z119 = obj instanceof Node;
            if ($z119) {
                Attribute $r219 = Attribute.f32368a;
                Node $r222 = (Node) obj;
                return $r219.toString($r222);
            }
            boolean $z120 = obj instanceof Item;
            if ($z120) {
                Attribute $r220 = Attribute.f32368a;
                Item $r232 = (Item) obj;
                return $r220.get($r232);
            }
            boolean $z121 = obj instanceof Method;
            if ($z121) {
                Attribute $r221 = Attribute.f32368a;
                Method $r242 = (Method) obj;
                return $r221.getString($r242);
            }
            boolean $z122 = obj instanceof Type;
            if ($z122) {
                Attribute $r223 = Attribute.f32368a;
                Type $r252 = (Type) obj;
                return $r223.write($r252);
            }
            boolean $z123 = obj instanceof SetupOptions;
            if ($z123) {
                SetupOptions $r262 = (SetupOptions) obj;
                return Attribute.getData($r262);
            }
            boolean $z124 = obj instanceof Integration;
            if ($z124) {
                Integration $r272 = (Integration) obj;
                return Attribute.get($r272);
            }
            boolean $z125 = obj instanceof C14590m;
            if ($z125) {
                Attribute $r224 = Attribute.f32368a;
                C14590m $r282 = (C14590m) obj;
                return $r224.m1073a($r282);
            }
            boolean $z126 = obj instanceof org.org.org.org.org.common.telemetry.Label;
            if ($z126) {
                Attribute $r225 = Attribute.f32368a;
                org.org.org.org.org.common.telemetry.Label $r292 = (org.org.org.org.org.common.telemetry.Label) obj;
                return $r225.m1070a($r292);
            }
            boolean $z127 = obj instanceof Throwable;
            if ($z127) {
                Throwable $r30 = (Throwable) obj;
                return Attribute.write($r30);
            }
            boolean $z128 = obj instanceof org.org.org.org.org.common.telemetry.Item;
            if ($z128) {
                Attribute $r226 = Attribute.f32368a;
                org.org.org.org.org.common.telemetry.Item $r31 = (org.org.org.org.org.common.telemetry.Item) obj;
                return $r226.get($r31, z);
            }
            boolean $z0 = obj instanceof Context;
            if ($z0) {
                Attribute $r227 = Attribute.f32368a;
                Context $r32 = (Context) obj;
                return $r227.getString($r32);
            }
            boolean $z02 = obj instanceof Bitmap;
            if ($z02) {
                Attribute $r228 = Attribute.f32368a;
                Bitmap $r33 = (Bitmap) obj;
                return $r228.next($r33);
            }
            boolean $z03 = obj instanceof File;
            if ($z03) {
                Attribute $r229 = Attribute.f32368a;
                File $r34 = (File) obj;
                return $r229.get($r34);
            }
            boolean $z04 = obj instanceof Bundle;
            if ($z04) {
                Attribute $r230 = Attribute.f32368a;
                Bundle $r35 = (Bundle) obj;
                return $r230.getString($r35);
            }
            boolean $z05 = obj instanceof UserProperties;
            if ($z05) {
                Attribute $r231 = Attribute.f32368a;
                UserProperties $r36 = (UserProperties) obj;
                return $r231.toString($r36);
            }
            boolean $z06 = obj instanceof EventTrackingMode;
            if ($z06) {
                Attribute $r233 = Attribute.f32368a;
                EventTrackingMode $r37 = (EventTrackingMode) obj;
                return $r233.toString($r37);
            }
            boolean $z07 = obj instanceof RenderingMode;
            if ($z07) {
                Attribute $r234 = Attribute.f32368a;
                RenderingMode $r38 = (RenderingMode) obj;
                return $r234.toString($r38);
            }
            boolean $z08 = obj instanceof RenderingModeOption;
            if ($z08) {
                Attribute $r235 = Attribute.f32368a;
                RenderingModeOption $r39 = (RenderingModeOption) obj;
                return $r235.toString($r39);
            }
            boolean $z09 = obj instanceof SegmentMiddlewareOption;
            if ($z09) {
                Attribute $r236 = Attribute.f32368a;
                SegmentMiddlewareOption $r40 = (SegmentMiddlewareOption) obj;
                return $r236.toString($r40);
            }
            boolean $z010 = obj instanceof Fragment;
            if ($z010) {
                Attribute $r237 = Attribute.f32368a;
                Fragment $r41 = (Fragment) obj;
                return $r237.getString($r41);
            }
            boolean $z011 = obj instanceof FragmentManager;
            if ($z011) {
                Attribute $r238 = Attribute.f32368a;
                FragmentManager $r42 = (FragmentManager) obj;
                return $r238.getString($r42);
            }
            boolean $z012 = obj instanceof RecordingMask;
            if ($z012) {
                Attribute $r239 = Attribute.f32368a;
                RecordingMask $r43 = (RecordingMask) obj;
                return $r239.get($r43);
            }
            boolean $z013 = obj instanceof RecordingMaskElement;
            if ($z013) {
                Attribute $r240 = Attribute.f32368a;
                RecordingMaskElement $r44 = (RecordingMaskElement) obj;
                return $r240.toString($r44);
            }
            boolean $z014 = obj instanceof SmartlookSensitivity;
            if ($z014) {
                Attribute $r241 = Attribute.f32368a;
                SmartlookSensitivity $r45 = (SmartlookSensitivity) obj;
                return $r241.toString($r45);
            }
            boolean $z015 = obj instanceof JSONObject;
            if ($z015) {
                return obj.toString();
            }
            boolean $z016 = obj instanceof org.org.org.org.asm.menu.Object;
            if ($z016) {
                org.org.org.org.asm.menu.Object $r46 = (org.org.org.org.asm.menu.Object) obj;
                JSONObject $r47 = $r46.equals();
                String $r4 = $r47.toString();
                Log_OC.loadImage($r4, "it.toJson().toString()");
                return $r4;
            }
            return obj.toString();
        } catch (Exception e) {
            return "formating error";
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String get(java.lang.Object obj, boolean $z0, int i, java.lang.Object obj2) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = false;
        }
        String $r1 = get(obj, $z0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final String remove(java.lang.Object obj) {
        String $r0 = get(obj, false, 2, null);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:40:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String toString(java.util.List r11, boolean r12, boolean r13) {
        /*
            org.org.org.org.asm.parser.Attribute r0 = org.org.org.org.asm.parser.Attribute.f32368a
            if (r11 == 0) goto L53
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto Ld
            java.lang.String r2 = "<empty>"
            return r2
        Ld:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            java.util.Iterator r5 = r11.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r6 = r5.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L3e
            java.lang.String r8 = get(r6, r12)
            r3.append(r8)
            int r9 = kotlin.p557z.C13722p.m3937g(r11)
            if (r4 == r9) goto L3c
            if (r13 == 0) goto L37
            java.lang.String r8 = "\n"
            goto L39
        L37:
            java.lang.String r8 = ", "
        L39:
            r3.append(r8)
        L3c:
            r4 = r7
            goto L17
        L3e:
            kotlin.p557z.C13722p.m3923n()
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r2 = "Null throw statement replaced by Soot"
            r10.<init>(r2)
            throw r10
        L49:
            java.lang.String r8 = r3.toString()
            java.lang.String r2 = "stringBuilder.toString()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r8, r2)
            return r8
        L53:
            java.lang.String r2 = "-"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.Log.toString(java.util.List, boolean, boolean):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String toString(List list, boolean $z0, boolean $z1, int i, java.lang.Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $z0 = false;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z1 = false;
        }
        String $r0 = toString(list, $z0, $z1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0004, code lost:
        r1 = kotlin.p557z.C13715n.m4025Z(r12);
     */
    /* JADX WARN: Incorrect condition in loop: B:45:0x0021 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String toString(java.lang.Object[] r12, boolean r13, boolean r14) {
        /*
            org.org.org.org.asm.parser.Attribute r0 = org.org.org.org.asm.parser.Attribute.f32368a
            if (r12 == 0) goto L59
            java.util.List r1 = kotlin.p557z.C13706j.m4097Z(r12)
            if (r1 == 0) goto L59
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L13
            java.lang.String r3 = "<empty>"
            return r3
        L13:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            java.util.Iterator r6 = r1.iterator()
        L1d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r7 = r6.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L44
            java.lang.String r9 = get(r7, r13)
            r4.append(r9)
            int r10 = kotlin.p557z.C13722p.m3937g(r1)
            if (r5 == r10) goto L42
            if (r14 == 0) goto L3d
            java.lang.String r9 = "\n"
            goto L3f
        L3d:
            java.lang.String r9 = ", "
        L3f:
            r4.append(r9)
        L42:
            r5 = r8
            goto L1d
        L44:
            kotlin.p557z.C13722p.m3923n()
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r3 = "Null throw statement replaced by Soot"
            r11.<init>(r3)
            throw r11
        L4f:
            java.lang.String r9 = r4.toString()
            java.lang.String r3 = "stringBuilder.toString()"
            kotlin.p483e0.p485d.Log_OC.loadImage(r9, r3)
            return r9
        L59:
            java.lang.String r3 = "-"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.asm.parser.Log.toString(java.lang.Object[], boolean, boolean):java.lang.String");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String toString(java.lang.Object[] objArr, boolean $z0, boolean $z1, int i, java.lang.Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $z0 = false;
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z1 = false;
        }
        String $r0 = toString(objArr, $z0, $z1);
        return $r0;
    }
}
