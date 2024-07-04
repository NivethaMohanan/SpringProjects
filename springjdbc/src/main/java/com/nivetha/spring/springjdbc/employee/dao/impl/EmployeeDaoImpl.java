package com.nivetha.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nivetha.spring.springjdbc.employee.dao.EmployeeDao;
import com.nivetha.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.nivetha.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public int Create(Employee employee) {
		String sql = "Insert into employee values (?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int Update(Employee employee) {
		String sql = "Update employee set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int Delete(int id) {
		String sql = "Delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	public Employee read(int id) {
		String sql = "Select * from employee where id=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return emp;
	}
	
	@Override
	public List<Employee> read() {
		String sql = "Select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [jdbcTemplate=" + jdbcTemplate + "]";
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
