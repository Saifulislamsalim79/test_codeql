package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ContentNewWalletTopUpBinding implements InterfaceC8209a {
    private final ConstraintLayout rootView;

    private ContentNewWalletTopUpBinding(ConstraintLayout constraintLayout) {
        this.rootView = constraintLayout;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentNewWalletTopUpBinding bind(View view) {
        if (view == null) {
            NullPointerException $r3 = new NullPointerException("rootView");
            throw $r3;
        }
        ConstraintLayout $r2 = (ConstraintLayout) view;
        ContentNewWalletTopUpBinding $r1 = new ContentNewWalletTopUpBinding($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentNewWalletTopUpBinding inflate(LayoutInflater layoutInflater) {
        ContentNewWalletTopUpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentNewWalletTopUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.content_new_wallet_top_up, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentNewWalletTopUpBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
