package ai.kudi.agent.custom.views;

import ai.kudi.agent.core.C0038R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewAnimationUtils;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CircuilarReveal.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m10421d2 = {"circleReveal", "", "myView", "Landroid/view/View;", "posFromRight", "", "containsOverflow", "", "isShow", "context", "Landroid/content/Context;", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CircuilarRevealKt {
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
    public static final void circleReveal(final View view, int i, boolean z, final boolean z2, Context context) {
        Animator $r3;
        String $r4;
        Log_OC.getArray(view, "myView");
        Log_OC.getArray(context, "context");
        int $i2 = view.getWidth();
        int $i0 = $i2;
        if (i > 0) {
            Resources $r2 = context.getResources();
            int $i02 = C0038R.dimen.abc_action_button_min_width;
            int $i1 = i * $r2.getDimensionPixelSize($i02);
            $i0 = $i2 - $i1;
        }
        Resources $r22 = context.getResources();
        int $i12 = C0038R.dimen.abc_action_button_min_width;
        $r22.getDimensionPixelSize($i12);
        if (z) {
            Resources $r23 = context.getResources();
            int $i13 = C0038R.dimen.abc_action_button_min_width_overflow;
            $i0 -= $r23.getDimensionPixelSize($i13);
        }
        int $i14 = view.getHeight();
        int $i15 = $i14 / 2;
        float $f0 = $i0;
        if (z2) {
            $r3 = ViewAnimationUtils.createCircularReveal(view, $i0, $i15, 0.0f, $f0);
            $r4 = "createCircularReveal(myView, cx, cy, 0f, width.toFloat())";
        } else {
            $r3 = ViewAnimationUtils.createCircularReveal(view, $i0, $i15, $f0, 0.0f);
            $r4 = "createCircularReveal(myView, cx, cy, width.toFloat(), 0f)";
        }
        Log_OC.loadImage($r3, $r4);
        $r3.setDuration(220L);
        $r3.addListener(new AnimatorListenerAdapter() { // from class: ai.kudi.agent.custom.views.CircuilarRevealKt$circleReveal$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
            	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
            	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Log_OC.getArray(animator, "animation");
                boolean $z0 = z2;
                if ($z0) {
                    return;
                }
                super.onAnimationEnd(animator);
                View $r24 = view;
                $r24.setVisibility(4);
            }
        });
        if (z2) {
            view.setVisibility(0);
        }
        $r3.start();
    }
}
