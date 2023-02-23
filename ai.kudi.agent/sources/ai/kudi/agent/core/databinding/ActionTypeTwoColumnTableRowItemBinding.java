package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActionTypeTwoColumnTableRowItemBinding implements InterfaceC8209a {
    public final TextView actionTextView;
    public final LinearLayout actionView;
    public final AppCompatImageView cancelImage;
    public final ProgressBar cancelLoanProgress;
    private final ConstraintLayout rootView;

    private ActionTypeTwoColumnTableRowItemBinding(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.actionTextView = textView;
        this.actionView = linearLayout;
        this.cancelImage = appCompatImageView;
        this.cancelLoanProgress = progressBar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActionTypeTwoColumnTableRowItemBinding bind(View view) {
        int $i0 = C0038R.C0040id.action_text_view;
        View $r1 = view.findViewById($i0);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.action_view;
            View $r12 = view.findViewById($i0);
            LinearLayout $r3 = (LinearLayout) $r12;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.cancel_image;
                View $r13 = view.findViewById($i0);
                AppCompatImageView $r4 = (AppCompatImageView) $r13;
                if ($r4 != null) {
                    $i0 = C0038R.C0040id.cancel_loan_progress;
                    View $r14 = view.findViewById($i0);
                    ProgressBar $r5 = (ProgressBar) $r14;
                    if ($r5 != null) {
                        ActionTypeTwoColumnTableRowItemBinding $r6 = new ActionTypeTwoColumnTableRowItemBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
                        return $r6;
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
    public static ActionTypeTwoColumnTableRowItemBinding inflate(LayoutInflater layoutInflater) {
        ActionTypeTwoColumnTableRowItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActionTypeTwoColumnTableRowItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.action_type_two_column_table_row_item;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActionTypeTwoColumnTableRowItemBinding $r3 = bind($r2);
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
