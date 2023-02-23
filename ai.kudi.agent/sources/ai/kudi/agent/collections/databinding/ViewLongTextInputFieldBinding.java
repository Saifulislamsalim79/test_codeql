package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewLongTextInputFieldBinding implements InterfaceC8209a {
    public final AppCompatTextView errorField;
    public final TextView hint;
    public final LinearLayout inputLayout;
    private final LinearLayout rootView;

    private ViewLongTextInputFieldBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView, TextView textView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.errorField = appCompatTextView;
        this.hint = textView;
        this.inputLayout = linearLayout2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewLongTextInputFieldBinding bind(View view) {
        int $i0 = R$id.errorField;
        View $r1 = view.findViewById($i0);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            $i0 = R$id.hint;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                LinearLayout $r4 = (LinearLayout) view;
                ViewLongTextInputFieldBinding $r5 = new ViewLongTextInputFieldBinding($r4, $r2, $r3, $r4);
                return $r5;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewLongTextInputFieldBinding inflate(LayoutInflater layoutInflater) {
        ViewLongTextInputFieldBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewLongTextInputFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.view_long_text_input_field;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewLongTextInputFieldBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
