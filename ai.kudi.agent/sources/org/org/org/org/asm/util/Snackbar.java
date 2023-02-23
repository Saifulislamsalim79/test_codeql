package org.org.org.org.asm.util;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.ClassWriter;
/* loaded from: classes.dex */
public final class Snackbar {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* renamed from: a */
    private static final Layout.Alignment m1047a(TextView textView) {
        Layout.Alignment alignment;
        ClassWriter $r2 = ClassWriter.f32305c;
        try {
            Object $r3 = ClassWriter.put($r2, TextView.class, textView, "getLayoutAlignment", Layout.Alignment.class, null, null, 48, null);
            alignment = (Layout.Alignment) $r3;
        } catch (Exception e) {
            alignment = null;
        }
        if (alignment != null) {
            return alignment;
        }
        int $i0 = textView.getGravity();
        if ($i0 != 1) {
            if ($i0 != 3) {
                if ($i0 != 5) {
                    if ($i0 != 17) {
                        if ($i0 != 8388611) {
                            if ($i0 != 8388613) {
                                Layout.Alignment $r4 = Layout.Alignment.ALIGN_NORMAL;
                                return $r4;
                            }
                        }
                    }
                }
                Layout.Alignment $r42 = Layout.Alignment.ALIGN_OPPOSITE;
                return $r42;
            }
            Layout.Alignment $r43 = Layout.Alignment.ALIGN_NORMAL;
            return $r43;
        }
        Layout.Alignment $r44 = Layout.Alignment.ALIGN_CENTER;
        return $r44;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final String getText(TextView textView) {
        String $r3;
        Log_OC.getArray(textView, "$this$transformedText");
        TransformationMethod $r1 = textView.getTransformationMethod();
        if ($r1 != null) {
            CharSequence $r2 = textView.getText();
            CharSequence $r22 = $r1.getTransformation($r2, textView);
            if ($r22 != null && ($r3 = $r22.toString()) != null) {
                return $r3;
            }
        }
        CharSequence $r23 = textView.getText();
        return $r23.toString();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final TextDirectionHeuristic init(TextView textView) {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 18) {
            int $i02 = textView.getLayoutDirection();
            boolean $z0 = $i02 == 1;
            int $i03 = textView.getTextDirection();
            switch ($i03) {
                case 1:
                    if ($z0) {
                        TextDirectionHeuristic r1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        return r1;
                    }
                    TextDirectionHeuristic r12 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    return r12;
                case 2:
                    TextDirectionHeuristic r13 = TextDirectionHeuristics.ANYRTL_LTR;
                    return r13;
                case 3:
                    TextDirectionHeuristic r14 = TextDirectionHeuristics.LTR;
                    return r14;
                case 4:
                    TextDirectionHeuristic r15 = TextDirectionHeuristics.RTL;
                    return r15;
                case 5:
                    TextDirectionHeuristic r16 = TextDirectionHeuristics.LOCALE;
                    return r16;
                case 6:
                    TextDirectionHeuristic r17 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    return r17;
                case 7:
                    TextDirectionHeuristic r18 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    return r18;
                default:
                    if ($z0) {
                        TextDirectionHeuristic r19 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        return r19;
                    }
                    TextDirectionHeuristic r110 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    return r110;
            }
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final StaticLayout show(TextView textView, int i) {
        Log_OC.getArray(textView, "$this$createStaticLayout");
        String $r1 = getText(textView);
        TextPaint $r2 = textView.getPaint();
        Layout.Alignment $r3 = m1047a(textView);
        TextDirectionHeuristic $r4 = init(textView);
        float $f0 = textView.getLineSpacingMultiplier();
        float $f1 = textView.getLineSpacingExtra();
        int $i1 = textView.getMaxLines();
        TextUtils.TruncateAt $r5 = textView.getEllipsize();
        int $i2 = Build.VERSION.SDK_INT;
        if ($i2 < 23) {
            int $i12 = $r1.length();
            return new StaticLayout($r1, 0, $i12, $r2, i, $r3, $f0, $f1, false, $r5, i);
        }
        int $i22 = $r1.length();
        StaticLayout.Builder $r6 = StaticLayout.Builder.obtain($r1, 0, $i22, $r2, i);
        StaticLayout.Builder $r62 = $r6.setAlignment($r3).setLineSpacing($f1, $f0).setIncludePad(false).setMaxLines($i1).setEllipsize($r5);
        TextDirectionHeuristic $r7 = TextDirectionHeuristics.LTR;
        StaticLayout.Builder $r63 = $r62.setTextDirection($r7);
        Log_OC.loadImage($r63, "StaticLayout.Builder.obt…tDirectionHeuristics.LTR)");
        if ($r4 != null) {
            $r63.setTextDirection($r4);
        }
        StaticLayout $r8 = $r63.build();
        Log_OC.loadImage($r8, "builder.build()");
        return $r8;
    }
}
