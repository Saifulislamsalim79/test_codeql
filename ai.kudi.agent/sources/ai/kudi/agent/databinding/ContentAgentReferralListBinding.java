package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ContentAgentReferralListBinding implements InterfaceC8209a {
    public final TextView indexTextView;
    public final TextView phoneNumberTextView;
    public final TextView referAction;
    private final ConstraintLayout rootView;
    public final TextView status;
    public final ImageView statusIndicator;

    private ContentAgentReferralListBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView) {
        this.rootView = constraintLayout;
        this.indexTextView = textView;
        this.phoneNumberTextView = textView2;
        this.referAction = textView3;
        this.status = textView4;
        this.statusIndicator = imageView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAgentReferralListBinding bind(View view) {
        int $i0 = C0001R.C0003id.indexTextView;
        View $r1 = view.findViewById(C0001R.C0003id.indexTextView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.phoneNumberTextView;
            View $r12 = view.findViewById(C0001R.C0003id.phoneNumberTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.referAction;
                View $r13 = view.findViewById(C0001R.C0003id.referAction);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.status;
                    View $r14 = view.findViewById(C0001R.C0003id.status);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.statusIndicator;
                        View $r15 = view.findViewById(C0001R.C0003id.statusIndicator);
                        ImageView imageView = (ImageView) $r15;
                        if (imageView != null) {
                            ConstraintLayout $r8 = (ConstraintLayout) view;
                            ContentAgentReferralListBinding $r7 = new ContentAgentReferralListBinding($r8, $r2, $r3, $r4, textView, imageView);
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
    public static ContentAgentReferralListBinding inflate(LayoutInflater layoutInflater) {
        ContentAgentReferralListBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ContentAgentReferralListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.content_agent_referral_list, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ContentAgentReferralListBinding $r3 = bind($r2);
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
