package ai.kudi.agent.kshock.p009ui.adapter;

import ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.kshock.ui.adapter.b */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnTouchListenerC0290b implements View.OnTouchListener {

    /* renamed from: e */
    public static final /* synthetic */ View$OnTouchListenerC0290b f566e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        View$OnTouchListenerC0290b $r0 = new View$OnTouchListenerC0290b();
        f566e = $r0;
    }

    private /* synthetic */ View$OnTouchListenerC0290b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean $z0 = KShockEligibilityCriteriaAdapter.CriteriaWithProgressViewHolder.m39632disableSeekBarDrag$lambda1(view, motionEvent);
        return $z0;
    }
}
