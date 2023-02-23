package ai.kudi.agent.issues.domain;

import ai.kudi.agent.core.schedulers.RxSchedulers;
import ai.kudi.agent.issues.domain.repositories.IssueRepository;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
/* compiled from: FetchCategoryByLabel.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/issues/domain/FetchCategoryByLabel;", "", "issueRepository", "Lai/kudi/agent/issues/domain/repositories/IssueRepository;", "rxSchedulers", "Lai/kudi/agent/core/schedulers/RxSchedulers;", "(Lai/kudi/agent/issues/domain/repositories/IssueRepository;Lai/kudi/agent/core/schedulers/RxSchedulers;)V", "execute", "Lio/reactivex/Observable;", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "label", "", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FetchCategoryByLabel {
    private final IssueRepository issueRepository;
    private final RxSchedulers rxSchedulers;

    public FetchCategoryByLabel(IssueRepository issueRepository, RxSchedulers rxSchedulers) {
        Log_OC.getArray(issueRepository, "issueRepository");
        Log_OC.getArray(rxSchedulers, "rxSchedulers");
        this.issueRepository = issueRepository;
        this.rxSchedulers = rxSchedulers;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p execute(String str) {
        Log_OC.getArray(str, "label");
        IssueRepository $r2 = this.issueRepository;
        AbstractC11688p $r3 = $r2.getIssueDetailsByLabel(str);
        RxSchedulers $r4 = this.rxSchedulers;
        Item $r5 = $r4.setSettings();
        AbstractC11688p $r32 = $r3.h0($r5);
        RxSchedulers $r42 = this.rxSchedulers;
        Item $r52 = $r42.main();
        AbstractC11688p $r33 = $r32.R($r52);
        Log_OC.loadImage($r33, "issueRepository.getIssueDetailsByLabel(label).subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.main())");
        return $r33;
    }
}
