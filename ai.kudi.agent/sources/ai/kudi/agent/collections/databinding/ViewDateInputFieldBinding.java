package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ViewDateInputFieldBinding implements InterfaceC8209a {
    public final AppCompatTextView errorView;
    public final FrameLayout flInputTextWrapper;
    public final LinearLayout inputLayout;
    public final AppCompatTextView inputTextView;
    public final TextView labelView;
    private final LinearLayout rootView;

    private ViewDateInputFieldBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView, FrameLayout frameLayout, LinearLayout linearLayout2, AppCompatTextView appCompatTextView2, TextView textView) {
        this.rootView = linearLayout;
        this.errorView = appCompatTextView;
        this.flInputTextWrapper = frameLayout;
        this.inputLayout = linearLayout2;
        this.inputTextView = appCompatTextView2;
        this.labelView = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDateInputFieldBinding bind(View view) {
        int $i0 = R$id.error_view;
        View $r1 = view.findViewById($i0);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            $i0 = R$id.fl_input_text_wrapper;
            View $r12 = view.findViewById($i0);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                LinearLayout $r4 = (LinearLayout) view;
                $i0 = R$id.input_text_view;
                View $r13 = view.findViewById($i0);
                AppCompatTextView appCompatTextView = (AppCompatTextView) $r13;
                if (appCompatTextView != null) {
                    $i0 = R$id.label_view;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        ViewDateInputFieldBinding $r7 = new ViewDateInputFieldBinding($r4, $r2, $r3, $r4, appCompatTextView, textView);
                        return $r7;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDateInputFieldBinding inflate(LayoutInflater layoutInflater) {
        ViewDateInputFieldBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewDateInputFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.view_date_input_field;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ViewDateInputFieldBinding $r3 = bind($r2);
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
