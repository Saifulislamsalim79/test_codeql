package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentProfileDetailsBinding implements InterfaceC8209a {
    public final CircleImageView circleImageView;
    public final ProfileInfoViewBinding include2;
    public final KycViewBinding kycView;
    public final TextView nameView;
    public final TextView phoneNoView;
    private final NestedScrollView rootView;
    public final UnverifiedUserViewBinding unverifiedUserView;

    private FragmentProfileDetailsBinding(NestedScrollView nestedScrollView, CircleImageView circleImageView, ProfileInfoViewBinding profileInfoViewBinding, KycViewBinding kycViewBinding, TextView textView, TextView textView2, UnverifiedUserViewBinding unverifiedUserViewBinding) {
        this.rootView = nestedScrollView;
        this.circleImageView = circleImageView;
        this.include2 = profileInfoViewBinding;
        this.kycView = kycViewBinding;
        this.nameView = textView;
        this.phoneNoView = textView2;
        this.unverifiedUserView = unverifiedUserViewBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProfileDetailsBinding bind(View view) {
        int $i0 = C0001R.C0003id.circleImageView;
        CircleImageView $r2 = (CircleImageView) view.findViewById(C0001R.C0003id.circleImageView);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.include2;
            View $r1 = view.findViewById(C0001R.C0003id.include2);
            if ($r1 != null) {
                ProfileInfoViewBinding $r3 = ProfileInfoViewBinding.bind($r1);
                $i0 = C0001R.C0003id.kyc_view;
                View $r12 = view.findViewById(C0001R.C0003id.kyc_view);
                if ($r12 != null) {
                    KycViewBinding $r4 = KycViewBinding.bind($r12);
                    $i0 = C0001R.C0003id.nameView;
                    TextView textView = (TextView) view.findViewById(C0001R.C0003id.nameView);
                    if (textView != null) {
                        $i0 = C0001R.C0003id.phoneNoView;
                        TextView textView2 = (TextView) view.findViewById(C0001R.C0003id.phoneNoView);
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.unverifiedUserView;
                            View $r13 = view.findViewById(C0001R.C0003id.unverifiedUserView);
                            if ($r13 != null) {
                                UnverifiedUserViewBinding $r7 = UnverifiedUserViewBinding.bind($r13);
                                FragmentProfileDetailsBinding $r8 = new FragmentProfileDetailsBinding((NestedScrollView) view, $r2, $r3, $r4, textView, textView2, $r7);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProfileDetailsBinding inflate(LayoutInflater layoutInflater) {
        FragmentProfileDetailsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentProfileDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_profile_details, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentProfileDetailsBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
