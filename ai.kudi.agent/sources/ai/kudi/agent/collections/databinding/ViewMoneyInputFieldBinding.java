package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewMoneyInputFieldBinding implements InterfaceC8209a {
    public final AppCompatTextView errorField;
    public final EditText field;
    public final TextView hint;
    public final LinearLayout inputLayout;
    public final TextView nairaText;
    private final LinearLayout rootView;

    private ViewMoneyInputFieldBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView, EditText editText, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.rootView = linearLayout;
        this.errorField = appCompatTextView;
        this.field = editText;
        this.hint = textView;
        this.inputLayout = linearLayout2;
        this.nairaText = textView2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewMoneyInputFieldBinding bind(View view) {
        int $i0 = R$id.errorField;
        View $r1 = view.findViewById($i0);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            $i0 = R$id.field;
            View $r12 = view.findViewById($i0);
            EditText $r3 = (EditText) $r12;
            if ($r3 != null) {
                $i0 = R$id.hint;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = R$id.inputLayout;
                    View $r14 = view.findViewById($i0);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = R$id.naira_text;
                        View $r15 = view.findViewById($i0);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            ViewMoneyInputFieldBinding $r7 = new ViewMoneyInputFieldBinding((LinearLayout) view, $r2, $r3, $r4, linearLayout, textView);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewMoneyInputFieldBinding inflate(LayoutInflater layoutInflater) {
        ViewMoneyInputFieldBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewMoneyInputFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.view_money_input_field;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewMoneyInputFieldBinding $r3 = bind($r2);
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
