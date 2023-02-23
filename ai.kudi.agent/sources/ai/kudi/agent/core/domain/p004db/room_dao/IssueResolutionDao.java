package ai.kudi.agent.core.domain.p004db.room_dao;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
/* compiled from: IssueResolutionDao.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000f2\u0006\u0010\u0010\u001a\u00020\rH'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u000fH'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\rH'J\b\u0010\u0013\u001a\u00020\u0003H'¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/core/domain/db/room_dao/IssueResolutionDao;", "", "addIssueDetails", "", "issueDetails", "", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "addIssueTypes", "issueTypes", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "getIssueCategoryByLabel", "Lio/reactivex/Maybe;", "label", "", "getIssueDetails", "Lio/reactivex/Observable;", "type", "getIssueTypes", "nukeIssueDetailsForType", "nukeIssueTable", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.IssueResolutionDao */
/* loaded from: classes.dex */
public interface IssueResolutionDao {
    void addIssueDetails(List list);

    void addIssueTypes(List list);

    AbstractC11677k getIssueCategoryByLabel(String str);

    AbstractC11688p getIssueDetails(String str);

    AbstractC11688p getIssueTypes();

    void nukeIssueDetailsForType(String str);

    void nukeIssueTable();
}
