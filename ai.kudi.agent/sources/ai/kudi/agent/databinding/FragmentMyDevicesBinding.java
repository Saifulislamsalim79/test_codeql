package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentMyDevicesBinding implements InterfaceC8209a {
    public final EmptyHistoryBinding devicesEmptyHistory;
    public final ProgressBar myDevicesProgressBar;
    public final RecyclerView myDevicesRv;
    private final ConstraintLayout rootView;
    public final KudiTextView textView36;

    private FragmentMyDevicesBinding(ConstraintLayout constraintLayout, EmptyHistoryBinding emptyHistoryBinding, ProgressBar progressBar, RecyclerView recyclerView, KudiTextView kudiTextView) {
        this.rootView = constraintLayout;
        this.devicesEmptyHistory = emptyHistoryBinding;
        this.myDevicesProgressBar = progressBar;
        this.myDevicesRv = recyclerView;
        this.textView36 = kudiTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentMyDevicesBinding bind(View view) {
        int $i0 = C0001R.C0003id.devices_empty_history;
        View $r1 = view.findViewById(C0001R.C0003id.devices_empty_history);
        if ($r1 != null) {
            EmptyHistoryBinding $r2 = EmptyHistoryBinding.bind($r1);
            $i0 = C0001R.C0003id.myDevicesProgressBar;
            ProgressBar $r3 = (ProgressBar) view.findViewById(C0001R.C0003id.myDevicesProgressBar);
            if ($r3 != null) {
                $i0 = C0001R.C0003id.myDevicesRv;
                RecyclerView $r4 = (RecyclerView) view.findViewById(C0001R.C0003id.myDevicesRv);
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.textView36;
                    KudiTextView $r5 = (KudiTextView) view.findViewById(C0001R.C0003id.textView36);
                    if ($r5 != null) {
                        FragmentMyDevicesBinding $r6 = new FragmentMyDevicesBinding((ConstraintLayout) view, $r2, $r3, $r4, $r5);
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
    public static FragmentMyDevicesBinding inflate(LayoutInflater layoutInflater) {
        FragmentMyDevicesBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentMyDevicesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_my_devices, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentMyDevicesBinding $r3 = bind($r2);
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
