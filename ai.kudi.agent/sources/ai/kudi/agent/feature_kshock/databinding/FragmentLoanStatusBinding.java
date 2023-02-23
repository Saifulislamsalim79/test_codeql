package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentLoanStatusBinding implements InterfaceC8209a {
    public final TextView loanSetteledText;
    public final LayoutLoanStatusItemBinding loanStatusItem;
    public final TextView loanStatusSummary;
    public final TextView nameText;
    public final TextView phoneText;
    private final LinearLayout rootView;
    public final CircleImageView userPicture;

    private FragmentLoanStatusBinding(LinearLayout linearLayout, TextView textView, LayoutLoanStatusItemBinding layoutLoanStatusItemBinding, TextView textView2, TextView textView3, TextView textView4, CircleImageView circleImageView) {
        this.rootView = linearLayout;
        this.loanSetteledText = textView;
        this.loanStatusItem = layoutLoanStatusItemBinding;
        this.loanStatusSummary = textView2;
        this.nameText = textView3;
        this.phoneText = textView4;
        this.userPicture = circleImageView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanStatusBinding bind(View view) {
        View $r1;
        int $i0 = C0220R.C0222id.loan_setteled_text;
        TextView $r2 = (TextView) view.findViewById($i0);
        if ($r2 != null && ($r1 = view.findViewById(($i0 = C0220R.C0222id.loan_status_item))) != null) {
            LayoutLoanStatusItemBinding $r3 = LayoutLoanStatusItemBinding.bind($r1);
            $i0 = C0220R.C0222id.loan_status_summary;
            TextView $r4 = (TextView) view.findViewById($i0);
            if ($r4 != null) {
                $i0 = C0220R.C0222id.name_text;
                TextView textView = (TextView) view.findViewById($i0);
                if (textView != null) {
                    $i0 = C0220R.C0222id.phone_text;
                    TextView textView2 = (TextView) view.findViewById($i0);
                    if (textView2 != null) {
                        $i0 = C0220R.C0222id.user_picture;
                        CircleImageView circleImageView = (CircleImageView) view.findViewById($i0);
                        if (circleImageView != null) {
                            LinearLayout $r9 = (LinearLayout) view;
                            FragmentLoanStatusBinding $r8 = new FragmentLoanStatusBinding($r9, $r2, $r3, $r4, textView, textView2, circleImageView);
                            return $r8;
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r12 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanStatusBinding inflate(LayoutInflater layoutInflater) {
        FragmentLoanStatusBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentLoanStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.fragment_loan_status;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentLoanStatusBinding $r3 = bind($r2);
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
