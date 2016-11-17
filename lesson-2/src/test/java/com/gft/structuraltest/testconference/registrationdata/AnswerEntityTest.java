package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
	@Test
	public void shouldReturnTrueWhenObjectEquals(){
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = an1;
		assertTrue(an1.equals(an2));
	}
	@Test
	public void shouldReturnTrueWhenObjectsEquals()
	{
		AnswerEntity an1 = new AnswerEntity();
		an1.setId(new Long(5));
		an1.setAnswerText("AnswerText");
		an1.setQuestion(new QuestionEntity());
		AnswerEntity an2 = new AnswerEntity();
		an2.setId(an1.getId());
		an2.setAnswerText(an1.getAnswerText());
		an2.setQuestion(an1.getQuestion());
		assertTrue(an1.equals(an2));
	}
	@Test
	public void shouldReturnFalseWhenObjectNotEquals()
	{
		AnswerEntity an1 = new AnswerEntity();
		QuestionEntity qn1 = new QuestionEntity();
		assertFalse(an1.equals(qn1));
	}
	@Test
	public void shouldReturnFalseWhenOtherAnswerTextIsNotNull()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an2.setAnswerText("AnswerText");
		assertFalse(an1.equals(an2));
	}
	@Test
	public void shouldReturnFalseWhenAnswerTextNotEquals()
	{
		AnswerEntity an1 = new AnswerEntity();
		an1.setAnswerText("AnswerText");
		AnswerEntity an2 = new AnswerEntity();
		an2.setAnswerText("Text");
		assertFalse(an1.equals(an2));
	}
	@Test
	public void shouldReturnFalseWhenIdIsNull()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an2.setId(new Long(2));
		assertFalse(an1.equals(an2));
	}
	@Test
	public void shouldReturnFalseWhenIdNotEquals()
	{
		AnswerEntity an1 = new AnswerEntity();
		an1.setId(new Long(5));
		AnswerEntity an2 = new AnswerEntity();
		an2.setId(new Long(1));
		assertFalse(an1.equals(an2));
	}
	@Test
	public void shouldReturnFalseWhenQuestionIsNull()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an2.setQuestion(new QuestionEntity());
		assertFalse(an1.equals(an2));
	}
	@Test
	public void shouldReturnFalseWhenQuestionNotEquals()
	{
		AnswerEntity an1 = new AnswerEntity();
		an1.setQuestion(new QuestionEntity());
		AnswerEntity an2 = new AnswerEntity();
		an2.setQuestion(new QuestionEntity());
		assertFalse(an1.equals(an2));
	}
	
    
}