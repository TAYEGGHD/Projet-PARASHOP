
import { Login } from "../PageObject/loginPO"

describe('empty spec', () => {
   
  const login = new Login


it('should open home page', () => {

  login.Navigate()

})

it('should click on connect', () => {

  login.Client()

})

it('should enter mail', () => {

  login.EnterMail('test.academy1@yahoo.com')

})



})