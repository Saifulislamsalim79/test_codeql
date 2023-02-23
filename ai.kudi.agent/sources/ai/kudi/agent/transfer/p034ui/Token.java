package ai.kudi.agent.transfer.p034ui;

import android.view.MotionEvent;
import android.view.View;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transfer.ui.Token */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements View.OnTouchListener {
    public static final /* synthetic */ Token previous;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        previous = $r0;
    }

    private /* synthetic */ Token() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean $z0 = TransferToBankFragment.m41385onViewCreated$lambda9$lambda4(view, motionEvent);
        return $z0;
    }
}
