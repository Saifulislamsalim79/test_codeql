package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.issues.p008ui.viewModels.RatingViewModel;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.RatingDialog_MembersInjector */
/* loaded from: classes.dex */
public final class RatingDialog_MembersInjector implements InterfaceC9463a<RatingDialog> {
    private final InterfaceC11700a<RatingViewModel> issueRatingViewModelProvider;

    public RatingDialog_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.issueRatingViewModelProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        RatingDialog_MembersInjector $r1 = new RatingDialog_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectIssueRatingViewModel(RatingDialog ratingDialog, RatingViewModel ratingViewModel) {
        ratingDialog.issueRatingViewModel = ratingViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(RatingDialog ratingDialog) {
        InterfaceC11700a $r3 = this.issueRatingViewModelProvider;
        Object $r2 = $r3.get();
        RatingViewModel $r4 = (RatingViewModel) $r2;
        injectIssueRatingViewModel(ratingDialog, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        RatingDialog $r2 = (RatingDialog) obj;
        injectMembers($r2);
    }
}
