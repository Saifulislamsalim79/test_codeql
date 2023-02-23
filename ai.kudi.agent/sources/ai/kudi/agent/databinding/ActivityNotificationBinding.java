package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityNotificationBinding implements InterfaceC8209a {
    public final ProgressBar loadNextProgressBar;
    public final TextView notificationTextView;
    public final ProgressBar progressBar;
    public final RecyclerView recyclerView;
    private final RelativeLayout rootView;

    private ActivityNotificationBinding(RelativeLayout relativeLayout, ProgressBar progressBar, TextView textView, ProgressBar progressBar2, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.loadNextProgressBar = progressBar;
        this.notificationTextView = textView;
        this.progressBar = progressBar2;
        this.recyclerView = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityNotificationBinding bind(View view) {
        int $i0 = C0001R.C0003id.loadNextProgressBar;
        View $r1 = view.findViewById(C0001R.C0003id.loadNextProgressBar);
        ProgressBar $r2 = (ProgressBar) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.notificationTextView;
            View $r12 = view.findViewById(C0001R.C0003id.notificationTextView);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.progressBar;
                View $r13 = view.findViewById(C0001R.C0003id.progressBar);
                ProgressBar $r4 = (ProgressBar) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.recyclerView;
                    View $r14 = view.findViewById(C0001R.C0003id.recyclerView);
                    RecyclerView recyclerView = (RecyclerView) $r14;
                    if (recyclerView != null) {
                        ActivityNotificationBinding $r6 = new ActivityNotificationBinding((RelativeLayout) view, $r2, $r3, $r4, recyclerView);
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
    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater) {
        ActivityNotificationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_notification, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityNotificationBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        RelativeLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public RelativeLayout getRoot() {
        RelativeLayout r1 = this.rootView;
        return r1;
    }
}
