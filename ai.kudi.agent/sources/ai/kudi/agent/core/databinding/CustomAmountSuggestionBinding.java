package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import ai.kudi.dip.library.button.KudiTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class CustomAmountSuggestionBinding implements InterfaceC8209a {
    public final KudiTextView amount;
    private final KudiTextView rootView;

    private CustomAmountSuggestionBinding(KudiTextView kudiTextView, KudiTextView kudiTextView2) {
        this.rootView = kudiTextView;
        this.amount = kudiTextView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomAmountSuggestionBinding bind(View view) {
        if (view == null) {
            NullPointerException $r3 = new NullPointerException("rootView");
            throw $r3;
        }
        KudiTextView $r1 = (KudiTextView) view;
        CustomAmountSuggestionBinding $r2 = new CustomAmountSuggestionBinding($r1, $r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomAmountSuggestionBinding inflate(LayoutInflater layoutInflater) {
        CustomAmountSuggestionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static CustomAmountSuggestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.custom_amount_suggestion;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        CustomAmountSuggestionBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public KudiTextView getRoot() {
        KudiTextView r1 = this.rootView;
        return r1;
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
}
