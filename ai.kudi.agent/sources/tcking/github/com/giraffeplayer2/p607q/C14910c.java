package tcking.github.com.giraffeplayer2.p607q;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.fragment.app.h;
import p272h.p275b.p283c.p284a.C8231b;
import p272h.p275b.p283c.p284a.C8232c;
import p272h.p275b.p283c.p285b.C8234a;
/* compiled from: TrackSelectorFragment.java */
/* renamed from: tcking.github.com.giraffeplayer2.q.c */
/* loaded from: classes3.dex */
public class C14910c extends h {

    /* renamed from: c */
    private C8234a f33377c;

    /* compiled from: TrackSelectorFragment.java */
    /* renamed from: tcking.github.com.giraffeplayer2.q.c$a */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC14911a implements View.OnClickListener {
        View$OnClickListenerC14911a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C14910c.this.dismissAllowingStateLoss();
        }
    }

    /* compiled from: TrackSelectorFragment.java */
    /* renamed from: tcking.github.com.giraffeplayer2.q.c$b */
    /* loaded from: classes3.dex */
    class C14912b implements ExpandableListView.OnGroupClickListener {
        C14912b(C14910c c14910c) {
        }

        @Override // android.widget.ExpandableListView.OnGroupClickListener
        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        View inflate = layoutInflater.inflate(C8232c.giraffe_track_selector, viewGroup, false);
        this.f33377c = new C8234a(inflate);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        C8234a c8234a = this.f33377c;
        c8234a.m16453e(C8231b.app_video_track_list);
        ExpandableListView expandableListView = (ExpandableListView) c8234a.m16448j();
        C8234a c8234a2 = this.f33377c;
        c8234a2.m16453e(C8231b.app_video_track_close);
        c8234a2.m16456b(new View$OnClickListenerC14911a());
        C14913d c14913d = new C14913d();
        expandableListView.setGroupIndicator(null);
        expandableListView.setOnGroupClickListener(new C14912b(this));
        expandableListView.setAdapter(c14913d);
        c14913d.m10d(getArguments().getString("fingerprint"));
        int groupCount = c14913d.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            expandableListView.expandGroup(i);
        }
    }
}
