package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import de.hdodenhof.circleimageview.CircleImageView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentPersonalBinding implements InterfaceC8209a {
    public final CircleImageView circleImageView;
    public final EditOutletDetailsViewBinding editOutletDetailsView;
    public final ProfileInfoViewBinding include2;
    public final KudiTextView nameView;
    public final KudiTextView phoneNoView;
    public final TextView relationshipMgrButton;
    private final NestedScrollView rootView;
    public final UnverifiedUserViewBinding unverifiedUserView;

    private FragmentPersonalBinding(NestedScrollView nestedScrollView, CircleImageView circleImageView, EditOutletDetailsViewBinding editOutletDetailsViewBinding, ProfileInfoViewBinding profileInfoViewBinding, KudiTextView kudiTextView, KudiTextView kudiTextView2, TextView textView, UnverifiedUserViewBinding unverifiedUserViewBinding) {
        this.rootView = nestedScrollView;
        this.circleImageView = circleImageView;
        this.editOutletDetailsView = editOutletDetailsViewBinding;
        this.include2 = profileInfoViewBinding;
        this.nameView = kudiTextView;
        this.phoneNoView = kudiTextView2;
        this.relationshipMgrButton = textView;
        this.unverifiedUserView = unverifiedUserViewBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPersonalBinding bind(View view) {
        int $i0 = C0001R.C0003id.circleImageView;
        CircleImageView $r2 = (CircleImageView) view.findViewById(C0001R.C0003id.circleImageView);
        if ($r2 != null) {
            $i0 = C0001R.C0003id.editOutletDetailsView;
            View $r1 = view.findViewById(C0001R.C0003id.editOutletDetailsView);
            if ($r1 != null) {
                EditOutletDetailsViewBinding $r3 = EditOutletDetailsViewBinding.bind($r1);
                $i0 = C0001R.C0003id.include2;
                View $r12 = view.findViewById(C0001R.C0003id.include2);
                if ($r12 != null) {
                    ProfileInfoViewBinding $r4 = ProfileInfoViewBinding.bind($r12);
                    $i0 = C0001R.C0003id.nameView;
                    KudiTextView kudiTextView = (KudiTextView) view.findViewById(C0001R.C0003id.nameView);
                    if (kudiTextView != null) {
                        $i0 = C0001R.C0003id.phoneNoView;
                        KudiTextView kudiTextView2 = (KudiTextView) view.findViewById(C0001R.C0003id.phoneNoView);
                        if (kudiTextView2 != null) {
                            $i0 = C0001R.C0003id.relationship_mgr_button;
                            TextView textView = (TextView) view.findViewById(C0001R.C0003id.relationship_mgr_button);
                            if (textView != null) {
                                $i0 = C0001R.C0003id.unverifiedUserView;
                                View $r13 = view.findViewById(C0001R.C0003id.unverifiedUserView);
                                if ($r13 != null) {
                                    UnverifiedUserViewBinding $r8 = UnverifiedUserViewBinding.bind($r13);
                                    NestedScrollView $r10 = (NestedScrollView) view;
                                    FragmentPersonalBinding $r9 = new FragmentPersonalBinding($r10, $r2, $r3, $r4, kudiTextView, kudiTextView2, textView, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPersonalBinding inflate(LayoutInflater layoutInflater) {
        FragmentPersonalBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentPersonalBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_personal, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentPersonalBinding $r3 = bind($r2);
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
