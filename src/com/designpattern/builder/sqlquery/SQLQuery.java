package com.designpattern.builder.sqlquery;

public class SQLQuery {

	private String table;
	private String columns;
	private String whereClause;
	private String orderBy;
	private String limit;

	// Private constructor to enforce the use of the builder
	private SQLQuery(QueryBuilder builder) {
		this.table = builder.table;
		this.columns = builder.columns;
		this.whereClause = builder.whereClause;
		this.orderBy = builder.orderBy;
		this.limit = builder.limit;
	}

	@Override
	public String toString() {
		StringBuilder query = new StringBuilder("SELECT ");
		query.append(columns != null ? columns : "*").append(" FROM ").append(table);

		if (whereClause != null) {
			query.append(" WHERE ").append(whereClause);
		}

		if (orderBy != null) {
			query.append(" ORDER BY ").append(orderBy);
		}

		if (limit != null) {
			query.append(" LIMIT ").append(limit);
		}

		return query.toString();
	}

	// Static nested Builder class
	public static class QueryBuilder {
		private String table;
		private String columns;
		private String whereClause;
		private String orderBy;
		private String limit;

		public QueryBuilder from(String table) {
			this.table = table;
			return this;
		}

		public QueryBuilder select(String columns) {
			this.columns = columns;
			return this;
		}

		public QueryBuilder where(String whereClause) {
			this.whereClause = whereClause;
			return this;
		}

		public QueryBuilder orderBy(String orderBy) {
			this.orderBy = orderBy;
			return this;
		}

		public QueryBuilder limit(String limit) {
			this.limit = limit;
			return this;
		}

		// Builds the final SQLQuery object
		public SQLQuery build() {
			return new SQLQuery(this);
		}
	}
}
