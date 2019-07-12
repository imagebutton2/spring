package com.train.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTPidIsNull() {
            addCriterion("t_pid is null");
            return (Criteria) this;
        }

        public Criteria andTPidIsNotNull() {
            addCriterion("t_pid is not null");
            return (Criteria) this;
        }

        public Criteria andTPidEqualTo(Integer value) {
            addCriterion("t_pid =", value, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidNotEqualTo(Integer value) {
            addCriterion("t_pid <>", value, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidGreaterThan(Integer value) {
            addCriterion("t_pid >", value, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_pid >=", value, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidLessThan(Integer value) {
            addCriterion("t_pid <", value, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidLessThanOrEqualTo(Integer value) {
            addCriterion("t_pid <=", value, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidIn(List<Integer> values) {
            addCriterion("t_pid in", values, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidNotIn(List<Integer> values) {
            addCriterion("t_pid not in", values, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidBetween(Integer value1, Integer value2) {
            addCriterion("t_pid between", value1, value2, "tPid");
            return (Criteria) this;
        }

        public Criteria andTPidNotBetween(Integer value1, Integer value2) {
            addCriterion("t_pid not between", value1, value2, "tPid");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTTeacherIsNull() {
            addCriterion("t_teacher is null");
            return (Criteria) this;
        }

        public Criteria andTTeacherIsNotNull() {
            addCriterion("t_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTTeacherEqualTo(String value) {
            addCriterion("t_teacher =", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotEqualTo(String value) {
            addCriterion("t_teacher <>", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherGreaterThan(String value) {
            addCriterion("t_teacher >", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("t_teacher >=", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLessThan(String value) {
            addCriterion("t_teacher <", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLessThanOrEqualTo(String value) {
            addCriterion("t_teacher <=", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLike(String value) {
            addCriterion("t_teacher like", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotLike(String value) {
            addCriterion("t_teacher not like", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherIn(List<String> values) {
            addCriterion("t_teacher in", values, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotIn(List<String> values) {
            addCriterion("t_teacher not in", values, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherBetween(String value1, String value2) {
            addCriterion("t_teacher between", value1, value2, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotBetween(String value1, String value2) {
            addCriterion("t_teacher not between", value1, value2, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTMemberIsNull() {
            addCriterion("t_member is null");
            return (Criteria) this;
        }

        public Criteria andTMemberIsNotNull() {
            addCriterion("t_member is not null");
            return (Criteria) this;
        }

        public Criteria andTMemberEqualTo(String value) {
            addCriterion("t_member =", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberNotEqualTo(String value) {
            addCriterion("t_member <>", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberGreaterThan(String value) {
            addCriterion("t_member >", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberGreaterThanOrEqualTo(String value) {
            addCriterion("t_member >=", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberLessThan(String value) {
            addCriterion("t_member <", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberLessThanOrEqualTo(String value) {
            addCriterion("t_member <=", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberLike(String value) {
            addCriterion("t_member like", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberNotLike(String value) {
            addCriterion("t_member not like", value, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberIn(List<String> values) {
            addCriterion("t_member in", values, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberNotIn(List<String> values) {
            addCriterion("t_member not in", values, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberBetween(String value1, String value2) {
            addCriterion("t_member between", value1, value2, "tMember");
            return (Criteria) this;
        }

        public Criteria andTMemberNotBetween(String value1, String value2) {
            addCriterion("t_member not between", value1, value2, "tMember");
            return (Criteria) this;
        }

        public Criteria andTGoalIsNull() {
            addCriterion("t_goal is null");
            return (Criteria) this;
        }

        public Criteria andTGoalIsNotNull() {
            addCriterion("t_goal is not null");
            return (Criteria) this;
        }

        public Criteria andTGoalEqualTo(String value) {
            addCriterion("t_goal =", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalNotEqualTo(String value) {
            addCriterion("t_goal <>", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalGreaterThan(String value) {
            addCriterion("t_goal >", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalGreaterThanOrEqualTo(String value) {
            addCriterion("t_goal >=", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalLessThan(String value) {
            addCriterion("t_goal <", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalLessThanOrEqualTo(String value) {
            addCriterion("t_goal <=", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalLike(String value) {
            addCriterion("t_goal like", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalNotLike(String value) {
            addCriterion("t_goal not like", value, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalIn(List<String> values) {
            addCriterion("t_goal in", values, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalNotIn(List<String> values) {
            addCriterion("t_goal not in", values, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalBetween(String value1, String value2) {
            addCriterion("t_goal between", value1, value2, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTGoalNotBetween(String value1, String value2) {
            addCriterion("t_goal not between", value1, value2, "tGoal");
            return (Criteria) this;
        }

        public Criteria andTStartIsNull() {
            addCriterion("t_start is null");
            return (Criteria) this;
        }

        public Criteria andTStartIsNotNull() {
            addCriterion("t_start is not null");
            return (Criteria) this;
        }

        public Criteria andTStartEqualTo(Date value) {
            addCriterion("t_start =", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartNotEqualTo(Date value) {
            addCriterion("t_start <>", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartGreaterThan(Date value) {
            addCriterion("t_start >", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartGreaterThanOrEqualTo(Date value) {
            addCriterion("t_start >=", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartLessThan(Date value) {
            addCriterion("t_start <", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartLessThanOrEqualTo(Date value) {
            addCriterion("t_start <=", value, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartIn(List<Date> values) {
            addCriterion("t_start in", values, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartNotIn(List<Date> values) {
            addCriterion("t_start not in", values, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartBetween(Date value1, Date value2) {
            addCriterion("t_start between", value1, value2, "tStart");
            return (Criteria) this;
        }

        public Criteria andTStartNotBetween(Date value1, Date value2) {
            addCriterion("t_start not between", value1, value2, "tStart");
            return (Criteria) this;
        }

        public Criteria andTEndIsNull() {
            addCriterion("t_end is null");
            return (Criteria) this;
        }

        public Criteria andTEndIsNotNull() {
            addCriterion("t_end is not null");
            return (Criteria) this;
        }

        public Criteria andTEndEqualTo(Date value) {
            addCriterion("t_end =", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndNotEqualTo(Date value) {
            addCriterion("t_end <>", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndGreaterThan(Date value) {
            addCriterion("t_end >", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndGreaterThanOrEqualTo(Date value) {
            addCriterion("t_end >=", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndLessThan(Date value) {
            addCriterion("t_end <", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndLessThanOrEqualTo(Date value) {
            addCriterion("t_end <=", value, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndIn(List<Date> values) {
            addCriterion("t_end in", values, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndNotIn(List<Date> values) {
            addCriterion("t_end not in", values, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndBetween(Date value1, Date value2) {
            addCriterion("t_end between", value1, value2, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTEndNotBetween(Date value1, Date value2) {
            addCriterion("t_end not between", value1, value2, "tEnd");
            return (Criteria) this;
        }

        public Criteria andTFilenameIsNull() {
            addCriterion("t_filename is null");
            return (Criteria) this;
        }

        public Criteria andTFilenameIsNotNull() {
            addCriterion("t_filename is not null");
            return (Criteria) this;
        }

        public Criteria andTFilenameEqualTo(String value) {
            addCriterion("t_filename =", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameNotEqualTo(String value) {
            addCriterion("t_filename <>", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameGreaterThan(String value) {
            addCriterion("t_filename >", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("t_filename >=", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameLessThan(String value) {
            addCriterion("t_filename <", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameLessThanOrEqualTo(String value) {
            addCriterion("t_filename <=", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameLike(String value) {
            addCriterion("t_filename like", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameNotLike(String value) {
            addCriterion("t_filename not like", value, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameIn(List<String> values) {
            addCriterion("t_filename in", values, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameNotIn(List<String> values) {
            addCriterion("t_filename not in", values, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameBetween(String value1, String value2) {
            addCriterion("t_filename between", value1, value2, "tFilename");
            return (Criteria) this;
        }

        public Criteria andTFilenameNotBetween(String value1, String value2) {
            addCriterion("t_filename not between", value1, value2, "tFilename");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}