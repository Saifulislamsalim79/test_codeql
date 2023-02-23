package ai.kudi.agent.postRegistrationSetUp.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PosSetUpFragment.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/fragments/PosSetUpFragment;", "Landroidx/fragment/app/Fragment;", "()V", "postRegistrationActivity", "Lai/kudi/agent/postRegistrationSetUp/PostRegistrationActivity;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PosSetUpFragment extends Fragment {
    public static final Companion Companion;
    private PostRegistrationActivity postRegistrationActivity;

    /* compiled from: PosSetUpFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/fragments/PosSetUpFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/postRegistrationSetUp/fragments/PosSetUpFragment;", "param1", "", "param2", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final PosSetUpFragment newInstance(String str, String str2) {
            Log_OC.getArray(str, "param1");
            Log_OC.getArray(str2, "param2");
            PosSetUpFragment $r3 = new PosSetUpFragment();
            Bundle $r4 = new Bundle();
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r4);
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final PosSetUpFragment newInstance(String str, String str2) {
        Companion $r1 = Companion;
        PosSetUpFragment $r2 = $r1.newInstance(str, str2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PostRegistrationActivity;
        if ($z0) {
            PostRegistrationActivity $r2 = (PostRegistrationActivity) context;
            this.postRegistrationActivity = $r2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_pos_set_up, viewGroup, false);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        PostRegistrationActivity $r4 = this.postRegistrationActivity;
        if ($r4 != null) {
            $r4.setTitle("Need POS?");
        }
        PostRegistrationActivity $r42 = this.postRegistrationActivity;
        if ($r42 != null) {
            String $r1 = getString(C0001R.string.need_pos_subtitle);
            Log_OC.loadImage($r1, "getString(R.string.need_pos_subtitle)");
            $r42.setSubtitle($r1);
        }
        PostRegistrationActivity $r43 = this.postRegistrationActivity;
        if ($r43 != null) {
            $r43.setButtonText("Get POS");
        }
        PostRegistrationActivity $r44 = this.postRegistrationActivity;
        if ($r44 == null) {
            return;
        }
        PosSetUpFragment$onViewCreated$1 $r5 = new PosSetUpFragment$onViewCreated$1(this);
        $r44.setActionButtonClickListener($r5);
    }
}
